import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class SemanticChecker {

    private final Map<String, String> variables = new HashMap<>();

    public static final List<String> ADD_OPERATIONS = Arrays.asList("+", "-", "||");
    public static final List<String> REL_OPERATIONS = Arrays.asList("<>", "==", "<", "<=", ">", ">=");
    public static final List<String> MUL_OPERATIONS = Arrays.asList("*", "/", "&&");
    public static final List<String> UNARY_OPERATIONS = List.of("#");

    public void visitDecl(GrammarParser.DeclContext ctx) {
        String variableType = ctx.var_type().getText();

        for (int i = 0;  i < ctx.idt().size(); i++) {
            String variableName = ctx.idt(i).getText();

            if (variables.get(variableName) == null) {
                variables.put(variableName, variableType);
            } else {
                throw new RuntimeException(String.format("Variable %s is already declared", variableName));
            }
        }
    }

    public void visitStmt_ass(GrammarParser.Stmt_assContext ctx) {
        checkVariable(ctx, ctx.idt().getText());
        String type = visitExpr(ctx.expr()).get(0);

        if (!type.equals(variables.get(ctx.idt().getText()))) {
            throw new RuntimeException(String.format("Invalid type assignment: variable %s with type (%s), but attempt assign (%s)",
                    ctx.idt().getText(),
                    variables.get(ctx.idt().getText()),
                    type));
        }
    }

    public  List<String> visitExpr(GrammarParser.ExprContext ctx) {

        List<String> stack = new ArrayList<>();

        if (ctx instanceof GrammarParser.Par_exprContext) {
            return visitPar_expr((GrammarParser.Par_exprContext) ctx);
        } else if (ctx instanceof GrammarParser.Unary_exprContext) {
            return visitUnary_expr((GrammarParser.Unary_exprContext) ctx);
        } else if (ctx instanceof GrammarParser.Mul_exprContext) {
            return visitMul_expr((GrammarParser.Mul_exprContext) ctx);
        } else if (ctx instanceof GrammarParser.Add_exprContext) {
            return visitAdd_expr((GrammarParser.Add_exprContext) ctx);
        } else if (ctx instanceof GrammarParser.Rel_exprContext) {
            return visitRel_expr((GrammarParser.Rel_exprContext) ctx);
        } else if (ctx instanceof GrammarParser.Bool_exprContext) {
            return visitBool_expr((GrammarParser.Bool_exprContext) ctx);
        } else if (ctx instanceof GrammarParser.Idt_exprContext) {
            return visitIdt_expr((GrammarParser.Idt_exprContext) ctx);
        } else if (ctx instanceof GrammarParser.Number_exprContext) {
            return visitNumber_expr((GrammarParser.Number_exprContext) ctx);
        }
        return stack;
    }

    public List<String> visitPar_expr(GrammarParser.Par_exprContext ctx) {
        return new ArrayList<>(visitExpr(ctx));
    }

    public List<String> visitUnary_expr(GrammarParser.Unary_exprContext ctx) {
        return new ArrayList<>(visitExpr(ctx));
    }

    public List<String> visitMul_expr(GrammarParser.Mul_exprContext ctx) {
        List<String> stack = new ArrayList<>();

        stack.addAll(visitExpr(ctx.expr(0)));
        stack.add(ctx.mul_op().getText());
        stack.addAll(visitExpr(ctx.expr(1)));

        normalizeStack(ctx, stack);

        return stack;
    }

    public List<String> visitAdd_expr(GrammarParser.Add_exprContext ctx) {
        List<String> stack = new ArrayList<>();

        stack.addAll(visitExpr(ctx.expr(0)));
        stack.add(ctx.add_op().getText());
        stack.addAll(visitExpr(ctx.expr(1)));

        normalizeStack(ctx, stack);

        return stack;
    }

    public List<String> visitRel_expr(GrammarParser.Rel_exprContext ctx) {
        List<String> stack = new ArrayList<>();

        stack.addAll(visitExpr(ctx.expr(0)));
        stack.add(ctx.rel_op().getText());
        stack.addAll(visitExpr(ctx.expr(1)));

        normalizeStack(ctx, stack);

        return stack;
    }

    public List<String> visitBool_expr(GrammarParser.Bool_exprContext ctx) {
        if (ctx.bool_value() != null) {
            return Collections.singletonList("boolean");
        }
        throw new RuntimeException("Unknown Bool type");
    }

    public List<String> visitIdt_expr(GrammarParser.Idt_exprContext ctx) {
        checkVariable(ctx, ctx.idt().getText());
        return Collections.singletonList(variables.get(ctx.idt().getText()));
    }

    public List<String> visitNumber_expr(GrammarParser.Number_exprContext ctx) {
        if (ctx.number().int_number() != null) {
            return Collections.singletonList("integer");
        }
        if (ctx.number().real_number() != null) {
            return Collections.singletonList("real");
        }
        throw new RuntimeException("Unknown Number type");
    }

    public void normalizeStack(ParserRuleContext ctx, List<String> stack) {
        while (stack.size() >= 3) {
            String el1 = stack.get(0);
            String op = stack.get(1);
            String el2 = stack.get(2);

            if (el1.equals("integer") && el2.equals("integer")) {
                stack.remove(el1);
                stack.remove(op);
                stack.remove(el2);

                if (ADD_OPERATIONS.contains(op) || MUL_OPERATIONS.contains(op)) {
                    stack.add(0, "integer");
                } else if(REL_OPERATIONS.contains(op)){
                    stack.add(0, "integer");
                }
                else {
                    throw  new RuntimeException(String.format("Invalid expression %s %s %s", el1, op, el2));
                }

                continue;
            }

            if (el1.equals("real") && el2.equals("real")) {
                stack.remove(el1);
                stack.remove(op);
                stack.remove(el2);

                if (ADD_OPERATIONS.contains(op) || MUL_OPERATIONS.contains(op)) {
                    stack.add(0, "real");
                }else if(REL_OPERATIONS.contains(op)){
                    stack.add(0, "real");
                }
                else {
                    throw  new RuntimeException(String.format("Invalid expression %s %s %s", el1, op, el2));
                }

                continue;
            }

            if (el1.equals("boolean") && el2.equals("boolean")) {
                stack.remove(el1);
                stack.remove(op);
                stack.remove(el2);

                if (REL_OPERATIONS.contains(op)) {
                    stack.add(0, "boolean");
                } else {
                    throw  new RuntimeException(String.format("Invalid expression %s %s %s", el1, op, el2));
                }

                continue;
            }

            throw new RuntimeException(String.format("Invalid expression %s %s %s", el1, op, el2));
        }
    }

    private void checkVariable(ParserRuleContext ctx, String idt) {
        if (variables.get(idt) == null) {
            throw new RuntimeException(String.format("Variable %s non exist", idt));
        }
    }

}
