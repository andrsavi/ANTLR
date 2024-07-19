// Generated from D:/Лабы/МАГА/Компиляторы/ANTLR/src/main/java/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(GrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(GrammarParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(GrammarParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(GrammarParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(GrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(GrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stmt_ass}.
	 * @param ctx the parse tree
	 */
	void enterStmt_ass(GrammarParser.Stmt_assContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stmt_ass}.
	 * @param ctx the parse tree
	 */
	void exitStmt_ass(GrammarParser.Stmt_assContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stmt_if}.
	 * @param ctx the parse tree
	 */
	void enterStmt_if(GrammarParser.Stmt_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stmt_if}.
	 * @param ctx the parse tree
	 */
	void exitStmt_if(GrammarParser.Stmt_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stmt_for}.
	 * @param ctx the parse tree
	 */
	void enterStmt_for(GrammarParser.Stmt_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stmt_for}.
	 * @param ctx the parse tree
	 */
	void exitStmt_for(GrammarParser.Stmt_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stmt_while}.
	 * @param ctx the parse tree
	 */
	void enterStmt_while(GrammarParser.Stmt_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stmt_while}.
	 * @param ctx the parse tree
	 */
	void exitStmt_while(GrammarParser.Stmt_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stmt_input}.
	 * @param ctx the parse tree
	 */
	void enterStmt_input(GrammarParser.Stmt_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stmt_input}.
	 * @param ctx the parse tree
	 */
	void exitStmt_input(GrammarParser.Stmt_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stmt_output}.
	 * @param ctx the parse tree
	 */
	void enterStmt_output(GrammarParser.Stmt_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stmt_output}.
	 * @param ctx the parse tree
	 */
	void exitStmt_output(GrammarParser.Stmt_outputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(GrammarParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(GrammarParser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPar_expr(GrammarParser.Par_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPar_expr(GrammarParser.Par_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(GrammarParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(GrammarParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(GrammarParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(GrammarParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rel_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRel_expr(GrammarParser.Rel_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rel_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRel_expr(GrammarParser.Rel_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idt_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdt_expr(GrammarParser.Idt_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idt_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdt_expr(GrammarParser.Idt_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber_expr(GrammarParser.Number_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber_expr(GrammarParser.Number_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul_expr(GrammarParser.Mul_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul_expr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul_expr(GrammarParser.Mul_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#idt}.
	 * @param ctx the parse tree
	 */
	void enterIdt(GrammarParser.IdtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#idt}.
	 * @param ctx the parse tree
	 */
	void exitIdt(GrammarParser.IdtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#int_number}.
	 * @param ctx the parse tree
	 */
	void enterInt_number(GrammarParser.Int_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#int_number}.
	 * @param ctx the parse tree
	 */
	void exitInt_number(GrammarParser.Int_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#real_number}.
	 * @param ctx the parse tree
	 */
	void enterReal_number(GrammarParser.Real_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#real_number}.
	 * @param ctx the parse tree
	 */
	void exitReal_number(GrammarParser.Real_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void enterBool_value(GrammarParser.Bool_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void exitBool_value(GrammarParser.Bool_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(GrammarParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(GrammarParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(GrammarParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(GrammarParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void enterMul_op(GrammarParser.Mul_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void exitMul_op(GrammarParser.Mul_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(GrammarParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(GrammarParser.Unary_opContext ctx);
}