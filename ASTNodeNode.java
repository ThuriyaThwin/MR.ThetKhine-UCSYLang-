/* Generated By:JJTree: Do not edit this line. ASTNodeNode.java */

public class ASTNodeNode extends SimpleNode {
  public ASTNodeNode(int id) {
    super(id);
  }

  public ASTNodeNode(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}