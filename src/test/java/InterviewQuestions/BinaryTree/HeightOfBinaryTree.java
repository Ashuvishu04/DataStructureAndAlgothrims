package InterviewQuestions.BinaryTree;

public class HeightOfBinaryTree {

  public static void main(String[] args) {
    TreeNode t1 = new TreeNode('a');
    t1.left = new TreeNode('b');
    t1.right = new TreeNode('c');
    t1.left.left = new TreeNode('d');
    t1.left.right = new TreeNode('e');
    t1.left.right.left = new TreeNode('f');
    t1.left.right.right = new TreeNode('g');
    t1.left.right.right.left = new TreeNode('h');
    t1.left.right.right.right = new TreeNode('i');
    t1.right.left = new TreeNode('j');
    t1.right.right = new TreeNode('k');
    t1.right.right.left = new TreeNode('l');
    t1.right.right.right = new TreeNode('m');

    int height = getHeight(t1);
    System.out.println(height);
  }

  static int getHeight(TreeNode treeNode){
    if(treeNode == null) return 0;

    int left  = getHeight(treeNode.left);
    int right = getHeight(treeNode.right);
    int h;
    if(left>right){
      h = 1 + left;
    }
    else{
      h = 1 + right;
    }
    return h;
  }

  static class TreeNode {
   char val;
   TreeNode left, right;

   TreeNode(char val) {
      this.val = val;
    }

   TreeNode(char val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
