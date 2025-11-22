package ast.Exp;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;

public class AstExpString extends AstExp
{
	public String value;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstExpString(String value)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.format("====================== exp -> STRING( %s )\n", value);

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.value = value;
	}

	/*************************************************/
	/* The printing message for a string exp AST node */
	/*************************************************/
	public void printMe()
	{
		System.out.format("AST NODE STRING( %s )\n", value);

		AstGraphviz.getInstance().logNode(
				serialNumber,
				String.format("STRING(%s)", value));
	}
}