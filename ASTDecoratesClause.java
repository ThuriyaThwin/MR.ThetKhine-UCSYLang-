/* Generated By:JJTree: Do not edit this line. ASTDecoratesClause.java */
import java.util.*;

public class ASTDecoratesClause extends DelegateClause {
	ArrayList<ASTBeforeCallOrAfterCall> beforeCallOrAfterCallList = new ArrayList<ASTBeforeCallOrAfterCall>();	
  public ASTDecoratesClause(int id) {
    super(id);
  }

  public ASTDecoratesClause(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
