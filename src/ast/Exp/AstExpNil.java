package ast.Exp;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;

public class AstExpNil extends AstExp
{
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstExpNil()
	{
		serialNumber = AstNodeSerialNumber.getFresh();

		System.out.print("====================== exp -> NIL\n");
	}

	/***********************************************/
	/* printing message for a NIL exp AST node     */
	/***********************************************/
	public void printMe()
	{
		System.out.print("AST NODE NIL\n");

		AstGraphviz.getInstance().logNode(
				serialNumber,
				"NIL");
	}
}