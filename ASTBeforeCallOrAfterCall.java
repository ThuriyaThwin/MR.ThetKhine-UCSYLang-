/* Generated By:JJTree: Do not edit this line. ASTBeforeCallOrAfterCall.java */

public class ASTBeforeCallOrAfterCall extends SimpleNode {
	BeforeOrAfterClause beforeOrAfter;
	DelegateClause delegateClause;	
  public ASTBeforeCallOrAfterCall(int id) {
    super(id);
  }

  public ASTBeforeCallOrAfterCall(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}