package InterviewQuestions.BinaryTree;

public class SubTree {

  public static void main(String[] args) {

  }

  static boolean isSubTree(TreeNode t1,TreeNode t2){
    if(t2==null)return true;
    if(t1 == null) return false;

    if(checkIdentical(t1,t2)) return true;

    return (isSubTree(t1.left,t2) || isSubTree(t1.right,t2));
  }

  static boolean checkIdentical(TreeNode t1,TreeNode t2){
    if(t1 == null && t2 == null) return true;

    if(t1!=null && t2!=null){
      if(t1.val == t2.val &&
          checkIdentical(t1.left,t2.left) && checkIdentical(t1.right,t2.right)){
        return true;
      }
    }
    return false;
  }
}
