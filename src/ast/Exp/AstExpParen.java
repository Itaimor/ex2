package ast.Exp;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;

public class AstExpParen extends AstExp
{
	public AstExp exp;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstExpParen(AstExp exp)
	{
		serialNumber = AstNodeSerialNumber.getFresh();

		System.out.print("====================== exp -> ( exp )\n");

		this.exp = exp;
	}

	/************************************************/
	/* printing message for a PAREN exp AST node    */
	/************************************************/
	public void printMe()
	{
		System.out.print("AST NODE PAREN EXP\n");

		if (exp != null) exp.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				"PAREN");

		if (exp != null) AstGraphviz.getInstance().logEdge(serialNumber, exp.serialNumber);
	}
}