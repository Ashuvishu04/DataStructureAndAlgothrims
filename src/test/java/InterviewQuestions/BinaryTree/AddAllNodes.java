package InterviewQuestions.BinaryTree;

public class AddAllNodes {

  public static void main(String[] args) {
    TreeNode t1  = new TreeNode(10);
    t1.left = new TreeNode(3);
    t1.right = new TreeNode(12);
    t1.left.left = new TreeNode(1);
    t1.left.right = new TreeNode(4);
    t1.right.left = new TreeNode(11);
    t1.right.right = new TreeNode(13);

    System.out.println(sum(t1));
  }

  static int sum(TreeNode treeNode){
    if(treeNode == null) return 0;

    int res = treeNode.val + sum(treeNode.left) + sum(treeNode.right);

    return res;
  }
}
