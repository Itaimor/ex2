package ast.Exp;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;
import ast.Type.AstType;

public class AstExpNewArray extends AstExp
{
	public AstType type;
	public AstExp size;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstExpNewArray(AstType type, AstExp size)
	{
		serialNumber = AstNodeSerialNumber.getFresh();

		System.out.print("====================== newExp -> NEW type [ exp ]\n");

		this.type = type;
		this.size = size;
	}

	/***************************************************/
	/* printing message for a NEW ARRAY exp AST node   */
	/***************************************************/
	public void printMe()
	{
		System.out.print("AST NODE NEW ARRAY\n");

		if (type != null) type.printMe();
		if (size != null) size.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				"NEW_ARRAY");

		if (type != null) AstGraphviz.getInstance().logEdge(serialNumber, type.serialNumber);
		if (size != null) AstGraphviz.getInstance().logEdge(serialNumber, size.serialNumber);
	}
}