/* Generated By:JJTree: Do not edit this line. ASTExecuteTimesStatement.java */

public class ASTExecuteTimesStatement extends ParentStatement  {
	ASTStatement statementBody;
	ASTExpression expression;
	
	String expressionType;
	Token t;
  public ASTExecuteTimesStatement(int id) {
    super(id);
  }

  public ASTExecuteTimesStatement(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
