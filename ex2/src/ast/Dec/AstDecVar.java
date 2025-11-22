package ast.Dec;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;
import ast.Type.AstType;
import ast.Exp.AstExp;

public class AstDecVar extends AstDec
{
	public AstType type;
	public String name;
	public AstExp exp; /* may be null */

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstDecVar(AstType type, String name, AstExp exp)
	{
		serialNumber = AstNodeSerialNumber.getFresh();

		if (exp == null)
			System.out.format("====================== varDec -> type ID( %s ) ;\n", name);
		else
			System.out.format("====================== varDec -> type ID( %s ) ASSIGN exp ;\n", name);

		this.type = type;
		this.name = name;
		this.exp = exp;
	}

	/************************************************/
	/* printing message for a VAR DEC AST node      */
	/************************************************/
	public void printMe()
	{
		System.out.format("AST NODE DEC VAR( %s )\n", name);

		if (type != null) type.printMe();
		if (exp != null) exp.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				String.format("DEC_VAR\n(%s)", name));

		if (type != null) AstGraphviz.getInstance().logEdge(serialNumber, type.serialNumber);
		if (exp != null) AstGraphviz.getInstance().logEdge(serialNumber, exp.serialNumber);
	}
}