package InterviewQuestions;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PreOrder {

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

  public static List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> l = new LinkedList<>();
    transverse(root,l);
    return l;
  }

  public static void transverse(TreeNode root,List<Integer> l){
    if(root!=null) {
      l.add(root.val);
      transverse(root.left, l);
      transverse(root.right, l);
    }
  }

  public static List<Integer> preorderTraversal2(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    List<Integer> l = new LinkedList<>();

    stack.push(root);
    while(!stack.isEmpty()){
      TreeNode node = stack.pop();
      if(node!=null) {
        l.add(node.val);
        stack.push(node.right);
        stack.push(node.left);
      }
    }
    return l;
  }

  public static void main(String[] args) {
    TreeNode treeNode = new TreeNode(1);
    treeNode.right = new TreeNode(2);
    treeNode.right.left = new TreeNode(3);
    System.out.println(preorderTraversal2(treeNode));
  }
}
