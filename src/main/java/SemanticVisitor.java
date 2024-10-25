import org.antlr.v4.runtime.tree.ParseTree;

public class SemanticVisitor extends GrammarBaseVisitor<Object> {

    private final SemanticChecker semanticChecker = new SemanticChecker();
    private ParseTree tree;

    @Override
    public Object visit(ParseTree tree) {
        this.tree = tree;
        return super.visit(tree);
    }

    @Override
    public Object visitDecl(GrammarParser.DeclContext ctx) {
        semanticChecker.visitDecl(ctx);
        return super.visitDecl(ctx);
    }

    @Override
    public Object visitStmt(GrammarParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    @Override
    public Object visitStmt_ass(GrammarParser.Stmt_assContext ctx) {
        semanticChecker.visitStmt_ass(ctx);
        return super.visitStmt_ass(ctx);
    }

    @Override
    public Object visitAdd_expr(GrammarParser.Add_exprContext ctx) {
        semanticChecker.visitExpr(ctx);
        return super.visitAdd_expr(ctx);
    }
}
