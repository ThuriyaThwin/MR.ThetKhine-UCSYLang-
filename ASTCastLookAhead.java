/* Generated By:JJTree: Do not edit this line. ASTCastLookAhead.java */

public class ASTCastLookAhead extends SimpleNode {
  public ASTCastLookAhead(int id) {
    super(id);
  }

  public ASTCastLookAhead(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
