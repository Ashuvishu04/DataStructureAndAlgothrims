package InterviewQuestions;

import InterviewQuestions.PostOrderTransversal.Node;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left,TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public static List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> l =  new LinkedList<>();
    Stack<TreeNode> stack = new Stack<>();

    TreeNode current = root;
    while(current!= null || !stack.isEmpty()){
        while(current!=null){
          stack.add(current);
          current = current.left;
        }

        current = stack.pop();
        l.add(current.val);
        current = current.right;
    }
    return l;
  }

  public static void main(String[] args) {
    TreeNode treeNode = new TreeNode(1);
    treeNode.right = new TreeNode(2);
    treeNode.right.left = new TreeNode(3);
    inorderTraversal(treeNode);
  }
}
