/* Generated By:JJTree: Do not edit this line. ASTNormalFieldDeclaration.java */
import java.util.*;

public class ASTNormalFieldDeclaration extends SimpleNode {
	
	UCSYField normalField;
	ArrayList<ASTFieldModifier> fieldModifier = new ArrayList<ASTFieldModifier>();
	ASTType type;
	ArrayList<ASTVariableDeclarator> variableDeclarator = new ArrayList<ASTVariableDeclarator>();
	String filedTypeName;
	int fieldAttribute;
  public ASTNormalFieldDeclaration(int id) {
    super(id);
  }

  public ASTNormalFieldDeclaration(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
