package ast.Dec;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;
import ast.ClassField.AstClassField;

public class AstDecClass extends AstDec
{
	public String name;
	public String parentName; /* may be null */
	public AstClassField fields; /* list */

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstDecClass(String name, String parentName, AstClassField fields)
	{
		serialNumber = AstNodeSerialNumber.getFresh();

		if (parentName == null)
			System.out.format("====================== classDec -> CLASS ID( %s ) { cField* }\n", name);
		else
			System.out.format("====================== classDec -> CLASS ID( %s ) EXTENDS ID( %s ) { cField* }\n", name, parentName);

		this.name = name;
		this.parentName = parentName;
		this.fields = fields;
	}

	/************************************************/
	/* printing message for a CLASS DEC AST node    */
	/************************************************/
	public void printMe()
	{
		if (parentName == null)
			System.out.format("AST NODE CLASS( %s )\n", name);
		else
			System.out.format("AST NODE CLASS( %s ) EXTENDS( %s )\n", name, parentName);

		if (fields != null) fields.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				parentName == null ?
					String.format("CLASS\n(%s)", name) :
					String.format("CLASS\n(%s)\nEXTENDS(%s)", name, parentName)
		);

		if (fields != null) AstGraphviz.getInstance().logEdge(serialNumber, fields.serialNumber);
	}
}