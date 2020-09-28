package InterviewQuestions;

import java.util.LinkedList;
import java.util.List;

public class PostOrderTransversal {

  public static void main(String[] args) {

  }

  public List<Integer> postorder(Node root) {

    LinkedList<Node> stack = new LinkedList<>();
    LinkedList<Integer> l = new LinkedList<>();
    if(root==null){
      return l;
    }

    stack.add(root);
    while(!stack.isEmpty()){
      Node node = stack.pollLast();
      l.addFirst(node.val);
      for(Node child : root.children){
        stack.add(child);
      }
    }

    return l;
  }

  static class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  }
}
