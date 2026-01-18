public class InsertAtHead {
    
    // Node definition
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to insert X at the head
    public static Node insertAtHead(Node head, int X) {
        Node newNode = new Node(X);
        //newNode is first pointing to null we have to make it point to head
        newNode.next = head; // step 2
        head = newNode;      // step 3
        return head;         // step 4
    }

    // Utility function to print list
    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example: head -> 1 -> 2 -> 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.print("Before: ");
        display(head);

        // Insert X=7 at head
        head = insertAtHead(head, 7);

        System.out.print("After:  ");
        display(head);
    }
}
