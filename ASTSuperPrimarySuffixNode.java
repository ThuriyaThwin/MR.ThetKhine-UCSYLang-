/* Generated By:JJTree: Do not edit this line. ASTSuperPrimarySuffixNode.java */

public class ASTSuperPrimarySuffixNode extends SimpleNode {
  public ASTSuperPrimarySuffixNode(int id) {
    super(id);
  }

  public ASTSuperPrimarySuffixNode(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
