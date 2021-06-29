public class Solution {
    public static void startConversion(Node root){
        Node head = null;
        head = convertToDLL(root, head);
        head = reverseLinkedList(head);
        printDLL(head);
    }

    private static Node convertToDLL(Node root, Node head) {
        if (root == null){
            return head;
        }

        head = convertToDLL(root.left, head);

        Node right = root.right;

        root.right = head;

        if (head != null){
            head.left = root;
        }

        head = root;

        return convertToDLL(right, head);
    }

    private static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null)
        {
            Node temp = current.left;
            current.left = current.right;
            current.right = temp;

            prev = current;
            current = current.left;
        }

        return prev;
    }

    private static void printDLL(Node head) {
        Node current = head;
        while (current != null){
            System.out.println(current.data + " ");
            current = current.right;
        }
    }
}