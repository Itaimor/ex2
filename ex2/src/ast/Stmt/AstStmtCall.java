package ast.Stmt;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;
import ast.Exp.AstExpCall;

public class AstStmtCall extends AstStmt
{
	public AstExpCall callExp;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstStmtCall(AstExpCall callExp)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.print("====================== stmt -> callExp ;\n");

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.callExp = callExp;
	}

	/***************************************************/
	/* printing message for a CALL stmt AST node      */
	/***************************************************/
	public void printMe()
	{
		System.out.print("AST NODE STMT CALL\n");

		if (callExp != null) callExp.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				"STMT\nCALL");

		if (callExp != null) AstGraphviz.getInstance().logEdge(serialNumber, callExp.serialNumber);
	}
}