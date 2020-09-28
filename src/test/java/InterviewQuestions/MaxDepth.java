package InterviewQuestions;

public class MaxDepth {

  public static void main(String[] args) {
    TreeNode treeNode = new TreeNode(3);
    treeNode.left = new TreeNode(9);
    treeNode.right = new TreeNode(20);
    treeNode.right.left = new TreeNode(15);
    treeNode.right.right = new TreeNode(7);
    int depth = maxDepth(treeNode);
    System.out.println(depth);
  }

  public static int maxDepth(TreeNode root) {
    if(root ==null){
      return 0;
    }

    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return Math.max(left,right) + 1;
  }

  public static class TreeNode {
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
}
