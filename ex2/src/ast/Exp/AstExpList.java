package ast.Exp;

import ast.AstGraphviz;
import ast.AstNode;
import ast.AstNodeSerialNumber;

public class AstExpList extends AstNode
{
	public AstExp head;
	public AstExpList tail;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstExpList(AstExp head, AstExpList tail)
	{
		serialNumber = AstNodeSerialNumber.getFresh();

		if (tail == null)
			System.out.print("====================== expList -> exp\n");
		else
			System.out.print("====================== expList -> exp , expList\n");

		this.head = head;
		this.tail = tail;
	}

	/*********************************************/
	/* The printing message for an expList node  */
	/*********************************************/
	public void printMe()
	{
		System.out.print("AST NODE EXP LIST\n");

		if (head != null) head.printMe();
		if (tail != null) tail.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				"EXP_LIST");

		if (head != null) AstGraphviz.getInstance().logEdge(serialNumber, head.serialNumber);
		if (tail != null) AstGraphviz.getInstance().logEdge(serialNumber, tail.serialNumber);
	}
}