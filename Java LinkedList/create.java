public class Create {

    // Step 1: Define a Node class
    static class Node {
        int data;        // actual data that the node will hold
        Node next;       // reference to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Step 2: Define a LinkedList class
    static class LinkedList {
        Node head; // head of the list (first node)

        // Step 3: Insert a new node at the end of the list
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

        // Step 4: Display the linked list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Step 5: Main method to test
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.insert(10);
        myList.insert(20);
        myList.insert(30);

        myList.display(); // Output: 10 -> 20 -> 30 -> null
    }
}


/*

If Node and LinkedList have no access modifier (just static class Node),
they can be used in any java file within the same folder/package.
“Accessible only inside the same package” means:

Other Java files in the same folder can use the class.
But Java files in different folders (packages) cannot use it unless you make it public.

✅ Summary:
You don’t need to make Node or LinkedList public if you're using them only inside Create.

They are already accessible from anywhere inside Create, because they are defined inside it.
🟢 Node and LinkedList are usable inside Create without public
🔴 But if you want to use them outside Create, they must be public.

You can create objects of nested classes without public as long as you're using them within the outer class.

🔑 Summary:
✅ Inside Create class → Access always allowed.

⚠️ Outside Create, same package → Needs public to be accessed.

🔒 Outside package → Needs public and outer class also must be public.
 */