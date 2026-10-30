import org.w3c.dom.Node;

class SinglyLinkedList {
    static class Node{
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
        public Node() {
            this.data = 0;
            this.next = null;
        }
    }
    private Node head;
    public SinglyLinkedList() {
        head = null;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return ;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next; //Moves current to the next node.
        }

        current.next = newNode; // Connects the current node to the new node.
    }

    public void display() {
        if(head == null) return;
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtpos(int pos, int data){
        if(head == null || pos == 1){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for(int i = 1; i<pos-1; i++) {
            if(current.next == null){
                break;
            }
            //moves current to the next node
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

}

public class addAndDelete {
    public static void main(String[] args) {
    SinglyLinkedList s1 = new SinglyLinkedList();
    s1.addLast(10);
    s1.addLast(20);
    s1.addLast(30);
    s1.addLast(40);

    s1.display();   
    s1.addFirst(100);
    s1.display();
    s1.addAtpos(3, 69);
    s1.display();
    }

} 