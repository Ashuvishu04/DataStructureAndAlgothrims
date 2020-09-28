package InterviewQuestions;

public class BinaryTreeTilt {

  public static void main(String[] args) {
    TreeNode treeNode  = new TreeNode(1,new TreeNode(2),new TreeNode(3));
    Tilt tilt = new Tilt();
    tilt.findTilt(treeNode);
  }
}

class Tilt {
  int tilt;

  public int findTilt(TreeNode root) {
    traverse(root);
    return tilt;

  }

  public int traverse(TreeNode root){

    if(root==null){
      return 0;
    }

    int left = traverse(root.left);
    int right = traverse(root.right);
    tilt += Math.abs(left - right) ;
    return left + right + root.val;
  }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
