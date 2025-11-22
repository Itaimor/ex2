package ast.Stmt;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;
import ast.Dec.AstDecVar;

public class AstStmtVarDec extends AstStmt
{
	public AstDecVar decVar;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstStmtVarDec(AstDecVar decVar)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.print("====================== stmt -> varDec\n");

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.decVar = decVar;
	}

	/****************************************************/
	/* printMe() for a variable declaration stmt AST node */
	/****************************************************/
	public void printMe()
	{
		System.out.print("AST NODE STMT VAR DEC\n");

		if (decVar != null) decVar.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				"STMT\nVAR_DEC");

		if (decVar != null) AstGraphviz.getInstance().logEdge(serialNumber, decVar.serialNumber);
	}
}