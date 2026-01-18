public class deleteNode {
    // node defination
    static class Node {
        int data ;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
      // Delete the given node (not the last one)
    public static void delete_node (Node node) {
        // Safety check: if node is null or it's the last node, do nothing
        if(node == null || node.next == null) {
            return;
        }
     // Step 1: Copy the data from the next node into the current node
     node.data = node.next.data;

     // Step 2: Skip over the next node
     node.next = node.next.next;
    } 
    
    // Display the list
    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        // Step 1: Create nodes
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(1);
        head.next.next.next = new Node(9);

        System.out.println("Before deletion:");
        display(head);

        // Step 2: Delete node with value 5
        Node nodeToDelete = head.next; // this is the node with data=5
        delete_node(nodeToDelete);

        System.out.println("After deletion:");
        display(head);
    }
    
}

/*
Algorithm (Step by Step)

Suppose the list is:

head → [4] → [5] → [1] → [9]


and we want to delete the node with value 5.

Look at the next node ([1]).

Copy its value into the current node:

current node (5) becomes 1


Now the list looks like:

head → [4] → [1] → [1] → [9]


Change the .next pointer of current node to skip the next node:

current.next = current.next.next


Which makes the list:

head → [4] → [1] → [9]


🎉 The node "5" is gone without touching head.
 */