/* Generated By:JJTree: Do not edit this line. ASTGTNode.java */

public class ASTGTNode extends ParentExpression{
	ParentExpression opOne,opTwo;
  public ASTGTNode(int id) {
    super(id);
  }

  public ASTGTNode(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
