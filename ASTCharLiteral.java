/* Generated By:JJTree: Do not edit this line. ASTCharLiteral.java */

public class ASTCharLiteral extends ParentExpression {
	char value;
	Token t;
  public ASTCharLiteral(int id) {
    super(id);
  }

  public ASTCharLiteral(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
