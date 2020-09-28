package InterviewQuestions.BinaryTree;


public class IsomorphicTrees {

  public static void main(String[] args) {
    TreeNode t1 = new TreeNode('a');
    t1.left = new TreeNode('b');
    t1.right = new TreeNode('c');
    t1.left.left = new TreeNode('d');
    t1.left.right = new TreeNode('e');
    t1.left.left.left = new TreeNode('h');
    t1.left.left.right = new TreeNode('j');
    t1.left.right.left = new TreeNode('f');
    t1.left.right.right = new TreeNode('g');

    TreeNode t2 = new TreeNode('a');
    t2.left = new TreeNode('c');
    t2.right = new TreeNode('b');
    t2.right.left = new TreeNode('e');
    t2.right.right = new TreeNode('d');
    t2.right.left.left = new TreeNode('g');
    t2.right.left.right = new TreeNode('f');
    t2.right.right.left = new TreeNode('h');
    t2.right.right.right = new TreeNode('j');

    System.out.println(isIsomorphic(t1,t2));
  }

  static boolean isIsomorphic(TreeNode t1,TreeNode t2){
    if(t1 == null && t2 == null)
      return true;
    if(t1 == null || t2 == null)
      return false;
    if(t1.val != t2.val)
      return false;

    if((isIsomorphic(t1.left,t2.left) && isIsomorphic(t1.right,t2.right))
        || (isIsomorphic(t1.left,t2.right) && isIsomorphic(t1.right,t2.left)))
      return true;

    return false;
  }

  static class TreeNode {
    char val;
    TreeNode left, right;

    TreeNode(char val) {
      this.val = val;
    }

    TreeNode(char val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
