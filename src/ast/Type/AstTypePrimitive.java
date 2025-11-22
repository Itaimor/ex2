package ast.Type;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;

public class AstTypePrimitive extends AstType
{
	public String typeName;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstTypePrimitive(String typeName)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.format("====================== type -> PRIMITIVE( %s )\n", typeName);

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.typeName = typeName;
	}

	/******************************************************/
	/* printing message for a PRIMITIVE type AST node      */
	/******************************************************/
	public void printMe()
	{
		System.out.format("AST NODE TYPE PRIMITIVE( %s )\n", typeName);

		AstGraphviz.getInstance().logNode(
				serialNumber,
				String.format("PRIMITIVE\n(%s)", typeName));
	}
}