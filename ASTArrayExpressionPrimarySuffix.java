/* Generated By:JJTree: Do not edit this line. ASTArrayExpressionPrimarySuffix.java */

public class ASTArrayExpressionPrimarySuffix extends ParentName {
	ParentExpression arrayIndexExpression;
  public ASTArrayExpressionPrimarySuffix(int id) {
    super(id);
  }

  public ASTArrayExpressionPrimarySuffix(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
