package ast;

import ast.Dec.AstDec;
import ast.AstGraphviz;
import ast.AstNodeSerialNumber;

public class AstProgram extends AstNode
{
	public AstDec head;
	public AstProgram next;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstProgram(AstDec head, AstProgram next)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.print("====================== program -> dec program\n");

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.head = head;
		this.next = next;
	}

	/*****************************************/
	/* The printing message for PROGRAM node */
	/*****************************************/
	public void printMe()
	{
		System.out.print("AST NODE PROGRAM\n");

		if (head != null) head.printMe();
		if (next != null)
			System.out.print("====================== program -> dec program\n");
		else
			System.out.print("====================== program -> dec\n");

		AstGraphviz.getInstance().logNode(
				serialNumber,
				"PROGRAM");

		if (head != null) AstGraphviz.getInstance().logEdge(serialNumber, head.serialNumber);
		if (next != null) AstGraphviz.getInstance().logEdge(serialNumber, next.serialNumber);
	}
}