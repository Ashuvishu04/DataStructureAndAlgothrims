package InterviewQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {

  static class TreeNode {
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

  public static List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    List<List<Integer>> ret = new ArrayList<>();
    while (!queue.isEmpty()) {
      int l = queue.size();
      List<Integer> level = new ArrayList<>();
      for (int i = 0; i < l; i++) {
        TreeNode node = queue.poll();
        if (node != null) {
          level.add(node.val);
          queue.add(node.left);
          queue.add(node.right);
        }
      }
      if (!level.isEmpty()) {
        ret.add(level);
      }
    }
    return ret;
  }

  public static void main(String[] args) {
    TreeNode treeNode = new TreeNode(3);
    treeNode.left = new TreeNode(9);
    treeNode.right = new TreeNode(20);
    treeNode.right.left = new TreeNode(15);
    treeNode.right.right = new TreeNode(7);
    System.out.println(levelOrder(treeNode));
  }
}
