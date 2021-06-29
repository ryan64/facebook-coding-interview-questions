public class Solution {
  public static void levelOrderTraversal(Node root){
    int level = 1; 
    while (printLevel(root, level)){
      level = level + 1; 
    }
  }

  public static boolean printLevel(Node root, int level){
    if(root == null){
      return false;
    }

    if (level == 1){
      System.out.println(root.data + " ");
      return true; 
    }

    boolean left = printLevel(root.left, level - 1);
    boolean right = printLevel(root.right, level - 1);

    return left || right; 
  }
}