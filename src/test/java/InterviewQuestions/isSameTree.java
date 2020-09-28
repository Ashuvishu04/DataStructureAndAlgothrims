package InterviewQuestions;

import java.util.LinkedList;
import java.util.List;

public class isSameTree {

  public static void main(String[] args) {
   TreeNode treeNode1  = new TreeNode(1);
   treeNode1.left = new TreeNode(2);

   TreeNode treeNode2  = new TreeNode(1);
   treeNode2.left = null;
   treeNode2.right = new TreeNode(2);

   isSameTree tree = new isSameTree();
   tree.isSameTree(treeNode1,treeNode2);
  }

  public boolean isSameTree(TreeNode p, TreeNode q) {
    return inOrder(p, q);
  }

  public boolean inOrder(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
        return true;
    } else if (p == null || q == null) {
        return false;
    } else if (p.val != q.val) {
        return false;
    }
    return inOrder(p.left, q.left) && inOrder(p.right, q.right);
  }


  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}

