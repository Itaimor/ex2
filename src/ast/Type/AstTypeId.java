package ast.Type;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;

public class AstTypeId extends AstType
{
	public String name;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstTypeId(String name)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.format("====================== type -> ID( %s )\n", name);

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.name = name;
	}

	/************************************************/
	/* printing message for a TYPE ID AST node       */
	/************************************************/
	public void printMe()
	{
		System.out.format("AST NODE TYPE ID( %s )\n", name);

		AstGraphviz.getInstance().logNode(
				serialNumber,
				String.format("TYPE_ID\n(%s)", name));
	}
}