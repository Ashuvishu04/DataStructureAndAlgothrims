package InterviewQuestions;

import java.util.Arrays;

public class CloneNode {

  public static void main(String[] args) {
      TreeNode node = new TreeNode(7);
      node.left = new TreeNode(4);
      node.right = new TreeNode(3);
      node.right.left = new TreeNode(6);
      node.right.right = new TreeNode(19);

      TreeNode node1 = node;

      CloneNode cloneNode = new CloneNode();
      cloneNode.getTargetCopy(node,node1,node.right);
  }

  public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

    if(original == null){
      return null;
    }

    if(original == target){
      return cloned;
    }

    TreeNode left = getTargetCopy(original.left,cloned.left,target);
    TreeNode right = getTargetCopy(original.right,cloned.right,target);

    return left == null ? right : left;

  }

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
      this.val = val;
    }
  }

}
