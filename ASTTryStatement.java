/* Generated By:JJTree: Do not edit this line. ASTTryStatement.java */
import java.util.*;
public class ASTTryStatement extends ParentStatement {
	int fromPC=-1;
	int toPC =-1;
	
	ASTBlock block;
	ArrayList<ASTCatchStatement> catchStatementList = new ArrayList<ASTCatchStatement>();
	ArrayList<Integer> jumpList = new ArrayList<Integer>();
	ASTBlock finallyBlock;
  public ASTTryStatement(int id) {
    super(id);
  }

  public ASTTryStatement(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
