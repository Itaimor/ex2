package ast.Dec;

import ast.AstGraphviz;
import ast.AstNodeSerialNumber;
import ast.Func.AstFuncParamList;
import ast.Type.AstType;
import ast.Stmt.AstStmtList;

public class AstDecFunc extends AstDec
{
    public AstType returnType;
    public String name;
    public AstFuncParamList params;
    public AstStmtList body;

    public AstDecFunc(AstType returnType, String name,
                      AstFuncParamList params,
                      AstStmtList body)
    {
        serialNumber = AstNodeSerialNumber.getFresh();

        System.out.format("====================== funcDec -> type ID( %s ) ( params ) { stmtList }\n", name);

        this.returnType = returnType;
        this.name = name;
        this.params = params;
        this.body = body;
    }

    public void printMe()
    {
        System.out.format("AST NODE FUNC( %s )\n", name);

        if (returnType != null) returnType.printMe();
        if (params != null) params.printMe();
        if (body != null) body.printMe();

        AstGraphviz.getInstance().logNode(
                serialNumber,
                String.format("FUNC\n(%s)", name));

        if (returnType != null)
            AstGraphviz.getInstance().logEdge(serialNumber, returnType.serialNumber);

        if (params != null)
            AstGraphviz.getInstance().logEdge(serialNumber, params.serialNumber);

        if (body != null)
            AstGraphviz.getInstance().logEdge(serialNumber, body.serialNumber);
    }
}