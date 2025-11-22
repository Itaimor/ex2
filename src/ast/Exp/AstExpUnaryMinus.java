package ast.Exp;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;

public class AstExpUnaryMinus extends AstExp
{
	public AstExp exp;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstExpUnaryMinus(AstExp exp)
	{
		serialNumber = AstNodeSerialNumber.getFresh();

		System.out.print("====================== exp -> MINUS exp\n");

		this.exp = exp;
	}

	/****************************************************/
	/* printing message for a unary minus exp AST node  */
	/****************************************************/
	public void printMe()
	{
		System.out.print("AST NODE UNARY MINUS\n");

		if (exp != null) exp.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				"UNARY_MINUS");

		if (exp != null) AstGraphviz.getInstance().logEdge(serialNumber, exp.serialNumber);
	}
}