package ast.ClassField;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;
import ast.AstNode;
import ast.Dec.AstDec;
import ast.Dec.AstDecVar;
import ast.Dec.AstDecFunc;

public class AstClassField extends AstNode
{
	public AstDec dec;
	public AstClassField next;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstClassField(AstDec dec, AstClassField next)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		serialNumber = AstNodeSerialNumber.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		if (dec instanceof AstDecVar)
			System.out.print("====================== cField -> varDec\n");
		else if (dec instanceof AstDecFunc)
			System.out.print("====================== cField -> funcDec\n");
		else
			System.out.print("====================== cField -> dec\n");

		/*******************************/
		/* COPY INPUT DATA MEMBERS ... */
		/*******************************/
		this.dec = dec;
		this.next = next;
	}

	/*******************************************************/
	/* The printing message for a CLASS FIELD AST node     */
	/*******************************************************/
	public void printMe()
	{
		System.out.print("AST NODE CLASS FIELD\n");

		if (dec != null) dec.printMe();
		if (next != null) next.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				"CLASS_FIELD");

		if (dec != null) AstGraphviz.getInstance().logEdge(serialNumber, dec.serialNumber);
		if (next != null) AstGraphviz.getInstance().logEdge(serialNumber, next.serialNumber);
	}
}