package ast.Stmt;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;
import ast.Exp.AstExp;

public class AstStmtReturn extends AstStmt
{
	public AstExp exp; /* may be null */

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstStmtReturn(AstExp exp)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.print("====================== stmt -> RETURN [ exp ] ;\n");

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.exp = exp;
	}

	/******************************************************/
	/* printing message for a RETURN stmt AST node        */
	/******************************************************/
	public void printMe()
	{
		System.out.print("AST NODE RETURN\n");

		if (exp != null) exp.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				"RETURN");

		if (exp != null) AstGraphviz.getInstance().logEdge(serialNumber, exp.serialNumber);
	}
}