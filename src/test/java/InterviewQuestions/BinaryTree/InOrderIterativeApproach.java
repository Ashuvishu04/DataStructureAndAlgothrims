package InterviewQuestions.BinaryTree;

import java.util.Stack;

public class InOrderIterativeApproach {

  public static void main(String[] args) {
    Node left = new Node('b');
    Node right = new Node('c');
    Node node = new Node('a',left,right);
    left.left  = new Node('d');
    left.right  = new Node('e');
    right.left = new Node('f');
    right.right = new Node('g');
    left.right.left  = new Node('h');
    right.left.left = new Node('m');
    right.left.right = new Node('k');

    InOrder(node);

  }

  public static void InOrder(Node root){

    Stack<Node> stack = new Stack<>();

    while(true){

      while(root!=null){
        stack.push(root);
        root = root.left;
      }

      if(stack.isEmpty()){
        break;
      }

      root = stack.pop();
      System.out.print(root.val);
      root = root.right;
    }
  }

  static class Node{
    char val;
    Node left,right;

    Node(char val){
      this.val = val;
    }

    Node(char val,Node left,Node right){
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
