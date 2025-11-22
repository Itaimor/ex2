package ast.Exp;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;
import ast.Var.AstVar;

public class AstExpCall extends AstExp
{
	public AstVar var;     /* may be null */
	public String name;
	public AstExpList args;    /* first argument */

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstExpCall(AstVar var, String name, AstExpList args)
	{
		serialNumber = AstNodeSerialNumber.getFresh();

		System.out.print("====================== exp -> [var .] ID ( exp* )\n");

		this.var = var;
		this.name = name;
		this.args = args;
	}

	/********************************************/
	/* printing message for a CALL exp AST node */
	/********************************************/
	public void printMe()
	{
		System.out.format("AST NODE CALL( %s )\n", name);

		if (var != null) var.printMe();
		if (args != null) args.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				String.format("CALL(%s)", name));

		if (var != null) AstGraphviz.getInstance().logEdge(serialNumber, var.serialNumber);
		if (args != null) AstGraphviz.getInstance().logEdge(serialNumber, args.serialNumber);
	}
}