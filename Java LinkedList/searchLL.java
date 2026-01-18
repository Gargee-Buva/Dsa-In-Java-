public class searchLL {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class
    static class LinkedList {
        Node head;

        // Insert new node at the end
        public void insert(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Search for a key in the list
        public boolean searchKey(int key) {
            Node current = head;

            while (current != null) {
                if (current.data == key) {
                    return true; // key found
                }
                current = current.next;
            }

            return false; // key not found
        }

        // Display the list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements into the list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Display the list
        list.display(); // Output: 10 -> 20 -> 30 -> 40 -> null

        // Search for keys
        int key1 = 20;
        int key2 = 50;

        System.out.println("Is " + key1 + " present? " + list.searchKey(key1)); // true
        System.out.println("Is " + key2 + " present? " + list.searchKey(key2)); // false
    }
}
