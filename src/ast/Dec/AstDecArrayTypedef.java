package ast.Dec;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;
import ast.Type.AstType;

public class AstDecArrayTypedef extends AstDec
{
	public String name;
	public AstType type;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstDecArrayTypedef(String name, AstType type)
	{
		serialNumber = AstNodeSerialNumber.getFresh();

		System.out.format("====================== arrayTypedef -> ARRAY ID( %s ) = type [] ;\n", name);

		this.name = name;
		this.type = type;
	}

	/*********************************************************/
	/* printing message for an ARRAY TYPEDEF AST node        */
	/*********************************************************/
	public void printMe()
	{
		System.out.format("AST NODE ARRAY TYPEDEF( %s )\n", name);

		if (type != null) type.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				String.format("ARRAY_TYPEDEF\n(%s)", name));

		if (type != null) AstGraphviz.getInstance().logEdge(serialNumber, type.serialNumber);
	}
}