package InterviewQuestions.BinaryTree;

public class TreeToMirrorTree {

  public static void main(String[] args) {
    TreeNode t1 = new TreeNode('a');
    t1.left = new TreeNode('b');
    t1.right = new TreeNode('c');
    t1.left.left = new TreeNode('d');
    t1.left.right = new TreeNode('e');
    t1.left.right.left = new TreeNode('f');
    t1.left.right.right = new TreeNode('g');

    convertToBinaryTree(t1);
  }
  
  
  static void convertToBinaryTree(TreeNode treeNode){
    if(treeNode!=null){
      convertToBinaryTree(treeNode.left);
      convertToBinaryTree(treeNode.right);
      TreeNode node = treeNode.left;
      treeNode.left = treeNode.right;
      treeNode.right = node;
    }
    return;
  }
}
