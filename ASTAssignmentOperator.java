/* Generated By:JJTree: Do not edit this line. ASTAssignmentOperator.java */

public class ASTAssignmentOperator extends SimpleNode {
	UCSYOperator operator;
  public ASTAssignmentOperator(int id) {
    super(id);
  }

  public ASTAssignmentOperator(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
