package InterviewQuestions.Adobe;

import InterviewQuestions.BinaryTree.TreeNode;

public class IsTreeBST {

  static TreeNode prev = null;

  public static void main(String[] args) {
    TreeNode treeNode = new TreeNode(4);
    treeNode.left = new TreeNode(2);
    treeNode.right = new TreeNode(5);
    treeNode.left.left = new TreeNode(1);
    treeNode.left.right = new TreeNode(3);

    isBST(treeNode);
  }

  private static boolean isBST(TreeNode treeNode) {
    return isBSTUtil(treeNode, Integer.MIN_VALUE,Integer.MAX_VALUE);
  }

  private static boolean isBSTUtil(TreeNode treeNode, int minValue, int maxValue) {

    if(treeNode == null)
      return true;

    if(treeNode.val < minValue || treeNode.val > maxValue)
      return false;

    return isBSTUtil(treeNode.left,minValue,treeNode.val-1)
        && isBSTUtil(treeNode.right,treeNode.val+1,maxValue);
  }

  // Alternative Approach
  private static boolean isBSTAlternative(TreeNode treeNode) {

    if(treeNode!=null){

      if(!isBSTAlternative(treeNode.left))
        return false;

      if(prev!=null && treeNode.val<=prev.val)
        return false;

      prev = treeNode;

      return isBSTAlternative(treeNode.right);
    }

    return false;
  }

}
