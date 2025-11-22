package ast.Exp;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;
import ast.Type.AstType;

public class AstExpNewType extends AstExp
{
	public AstType type;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstExpNewType(AstType type)
	{
		serialNumber = AstNodeSerialNumber.getFresh();

		System.out.print("====================== newExp -> NEW type\n");

		this.type = type;
	}

	/**************************************************/
	/* printing message for a NEW TYPE exp AST node   */
	/**************************************************/
	public void printMe()
	{
		System.out.print("AST NODE NEW TYPE\n");

		if (type != null) type.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				"NEW_TYPE");

		if (type != null) AstGraphviz.getInstance().logEdge(serialNumber, type.serialNumber);
	}
}