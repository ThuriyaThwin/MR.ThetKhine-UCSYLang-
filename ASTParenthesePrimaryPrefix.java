/* Generated By:JJTree: Do not edit this line. ASTParenthesePrimaryPrefix.java */

public class ASTParenthesePrimaryPrefix extends ParentName {
	ParentExpression parExpression;
  public ASTParenthesePrimaryPrefix(int id) {
    super(id);
  }

  public ASTParenthesePrimaryPrefix(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
