//Refer it as notes 

public class reference {
    // Step 1: Define a Node class
    class Node {
    int data;      //actual data that the node will hold,you can also use other data types 
    Node next;      

    Node(int data) {     //When we create a new node, we want to initialize its data with a given value. 
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head; // head of the list (first node)

    // Step 3: This method is used to add a new node to the end of the linked list.It accepts the value to be stored in the new node.


    public void insert(int data) {
        Node newNode = new Node(data);

        //If the list is empty, start it by assigning the head. Don't try to traverse yet — there's nothing to walk through
        if (head == null) {
            head = newNode;
            return;
        }

        // traverse to the end of the list
        Node current = head;    //Creates a temporary pointer current and sets it to head
        while (current.next != null) {
            current = current.next;     //current.next is The node linked after it
        }

        // add the new node at the end
        current.next = newNode;
    }

    // Step 4: Method to print the list
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}


}

/*
| Part         | Purpose                                                              |
| -------------| ---------------------------------------------------------------------|
| Node next;   | Declares a reference to the **next node** in the list                |
| Type is Node | Because it must hold a reference to another object of the same class |
| Why?         | So we can chain multiple nodes together in a list                    |

Node next; references another object of the same class to establish linking within the data

"this.data allows us to write a new value which is passed in the Node constructor for creating a new node."

LINE 7 - FOR CREATING NEW NODE WITH NEW VALUE AND REFERENCE
 */