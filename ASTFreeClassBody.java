/* Generated By:JJTree: Do not edit this line. ASTFreeClassBody.java */
import java.util.*;

public class ASTFreeClassBody extends SimpleNode {
	ArrayList<ASTMethodDeclaration> methodDeclarationList = new ArrayList<ASTMethodDeclaration>();
  public ASTFreeClassBody(int id) {
    super(id);
  }

  public ASTFreeClassBody(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
