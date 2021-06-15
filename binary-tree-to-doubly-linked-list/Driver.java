public class Driver {
   public static void main(String[] args){
    Node root = new Node(100);
    root.left = new Node(50);
    root.right = new Node(200);
    root.left.left = new Node(25);
    root.left.right = new Node(75);
    root.right.left = new Node(125);
    root.right.right = new Node(350);
    root.left.left.right = new Node(30);
    root.left.right.left = new Node(60);

    Solution.startConversion(root); 
  }
}