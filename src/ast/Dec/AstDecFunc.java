package ast.Dec;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;
import ast.Type.AstType;
import ast.Stmt.AstStmtList;

public class AstDecFunc extends AstDec
{
	public AstType returnType;
	public String name;
	public AstType paramTypes; /* linked list or null */
	public AstDecFunc nextParam; /* optional */
	public AstStmtList body;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AstDecFunc(AstType returnType, String name, AstType paramTypes, AstDecFunc nextParam, AstStmtList body)
	{
		serialNumber = AstNodeSerialNumber.getFresh();

		System.out.format("====================== funcDec -> type ID( %s ) ( params ) { stmtList }\n", name);

		this.returnType = returnType;
		this.name = name;
		this.paramTypes = paramTypes;
		this.nextParam = nextParam;
		this.body = body;
	}

	/************************************************/
	/* printing message for a FUNC DEC AST node     */
	/************************************************/
	public void printMe()
	{
		System.out.format("AST NODE FUNC( %s )\n", name);

		if (returnType != null) returnType.printMe();
		if (paramTypes != null) paramTypes.printMe();
		if (nextParam != null) nextParam.printMe();
		if (body != null) body.printMe();

		AstGraphviz.getInstance().logNode(
				serialNumber,
				String.format("FUNC\n(%s)", name));

		if (returnType != null) AstGraphviz.getInstance().logEdge(serialNumber, returnType.serialNumber);
		if (paramTypes != null) AstGraphviz.getInstance().logEdge(serialNumber, paramTypes.serialNumber);
		if (nextParam != null) AstGraphviz.getInstance().logEdge(serialNumber, nextParam.serialNumber);
		if (body != null) AstGraphviz.getInstance().logEdge(serialNumber, body.serialNumber);
	}
}