/* Generated By:JJTree: Do not edit this line. ASTClassBody.java */

import java.util.*;
public class ASTClassBody extends SimpleNode {
	ArrayList<ASTMemberDeclaration> member = new ArrayList<ASTMemberDeclaration>();
  public ASTClassBody(int id) {
    super(id);
  }

  public ASTClassBody(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
