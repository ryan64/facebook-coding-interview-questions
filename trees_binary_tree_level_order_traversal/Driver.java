public class Driver {
   public static void main(String[] args){
    Node root = new Node(100);
    root.left = new Node(50);
    root.right = new Node(200);
    root.left.left = new Node(25);
    root.left.right = new Node(75);
    root.right.right = new Node(350);

    Solution.levelOrderTraversal(root);
  }
}