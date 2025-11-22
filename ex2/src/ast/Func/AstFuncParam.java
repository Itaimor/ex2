package ast.Func;

import ast.AstGraphviz;
import ast.AstNode;
import ast.AstNodeSerialNumber;
import ast.Type.*;

public class AstFuncParam extends AstNode {
    public AstType type;
    public String name;
    public AstFuncParam next;

    public AstFuncParam(AstType type, String name, AstFuncParam next) {
        serialNumber = AstNodeSerialNumber.getFresh();
        this.type = type;
        this.name = name;
        this.next = next;
    }

    public AstFuncParam(AstType type, String name) {
        this(type, name, null);
    }

    public void printMe() {
        System.out.printf("AST FUNC PARAM (%s)\n", name);
        if (type != null) type.printMe();
        if (next != null) next.printMe();

        AstGraphviz.getInstance().logNode(
            serialNumber,
            String.format("PARAM\n(%s)", name)
        );

        if (type != null)
            AstGraphviz.getInstance().logEdge(serialNumber, type.serialNumber);
        if (next != null)
            AstGraphviz.getInstance().logEdge(serialNumber, next.serialNumber);
    }
}