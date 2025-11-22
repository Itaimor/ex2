package ast.Stmt;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;
import ast.Exp.AstExp;

public class AstStmtIf extends AstStmt
{
	public AstExp cond;
	public AstStmtList thenBody;
	public AstStmtList elseBody; /* may be null */

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstStmtIf(AstExp cond, AstStmtList thenBody, AstStmtList elseBody)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		if (elseBody == null)
			System.out.print("====================== stmt -> IF ( exp ) { stmtList }\n");
		else
			System.out.print("====================== stmt -> IF ( exp ) { stmtList } ELSE { stmtList }\n");

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.cond = cond;
		this.thenBody = thenBody;
		this.elseBody = elseBody;
	}

	/**************************************************/
	/* The printing message for an if stmt AST node   */
	/**************************************************/
	public void printMe()
	{
		System.out.print("AST NODE IF\n");

		if (cond != null) cond.printMe();
		if (thenBody != null) thenBody.printMe();
		if (elseBody != null) elseBody.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				elseBody == null ? "IF" : "IF_ELSE");

		if (cond != null) AstGraphviz.getInstance().logEdge(serialNumber, cond.serialNumber);
		if (thenBody != null) AstGraphviz.getInstance().logEdge(serialNumber, thenBody.serialNumber);
		if (elseBody != null) AstGraphviz.getInstance().logEdge(serialNumber, elseBody.serialNumber);
	}
}