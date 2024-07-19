// Generated from D:/Лабы/МАГА/Компиляторы/ANTLR/src/main/java/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(GrammarParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(GrammarParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(GrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stmt_ass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_ass(GrammarParser.Stmt_assContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stmt_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_if(GrammarParser.Stmt_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stmt_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_for(GrammarParser.Stmt_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stmt_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_while(GrammarParser.Stmt_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stmt_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_input(GrammarParser.Stmt_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stmt_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_output(GrammarParser.Stmt_outputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr(GrammarParser.Unary_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code par_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_expr(GrammarParser.Par_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expr(GrammarParser.Add_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(GrammarParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rel_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_expr(GrammarParser.Rel_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idt_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdt_expr(GrammarParser.Idt_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_expr(GrammarParser.Number_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_expr(GrammarParser.Mul_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#idt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdt(GrammarParser.IdtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(GrammarParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#real_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_number(GrammarParser.Real_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bool_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_value(GrammarParser.Bool_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(GrammarParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#add_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_op(GrammarParser.Add_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#mul_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_op(GrammarParser.Mul_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op(GrammarParser.Unary_opContext ctx);
}