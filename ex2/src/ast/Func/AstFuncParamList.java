package ast.Func;

import ast.AstGraphviz;
import ast.AstNode;
import ast.AstNodeSerialNumber;

public class AstFuncParamList extends AstNode {
    public AstFuncParam head;
    public AstFuncParamList tail;

    public AstFuncParamList(AstFuncParam head, AstFuncParamList tail) {
        serialNumber = AstNodeSerialNumber.getFresh();
        this.head = head;
        this.tail = tail;
    }

    public void printMe() {
        if (head != null) head.printMe();
        if (tail != null) tail.printMe();

        AstGraphviz.getInstance().logNode(serialNumber, "PARAM_LIST");

        if (head != null) AstGraphviz.getInstance().logEdge(serialNumber, head.serialNumber);
        if (tail != null) AstGraphviz.getInstance().logEdge(serialNumber, tail.serialNumber);
    }
}