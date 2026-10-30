class DoubleLinearList{
    static class Node{
       int data;
       Node next;
       Node prev;
       
       public Node() {
        this.data = 0;
        this.next = null;
        this.prev = null;
       }
       public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
       }
    }
    private Node head;
    public  DoubleLinearList() {
        head = null;
    }

    public void fwdDisplay() {
        if(head != null) {
            Node current = head;
            //check
            while(current != null){
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("Null");
        }
    }
    public void revDisplay() {
        if(head != null) {
            Node current = head;
            //to go to last node
            while(current.next != null){
                current = current.next;
            }
            //to print from last node 
            while(current != null) {
                System.out.print(current.data + "->");
                current = current.prev;
            }
            System.out.print("Null");
        }
    }

    public void addLast(int data) {
        // create and initialize new node
        Node newNode = new Node(data);
        // if list is empty
        if(head == null){
            head = newNode;
        }
        else{
        Node current = head;
        while(current.next != null) {
			current = current.next; 
		}
        current.next = newNode;
        newNode.prev = current;
    } 
    }

    public void addFirst(int data) {
        // create and initialize new node
        Node newNode = new Node(data);
        // if list is empty, add node at the start (head)
        if(head == null) {
            head = newNode;
        }
        //add new node before head	
        newNode.next = head;
        head.prev = newNode;
        //change head to new node
        head = newNode;
    }

    public void addAtpos(int pos, int data){
        if(head == null || pos<=1)
            addFirst(data);

        Node newNode = new Node(data);
        // traverse till pos along with a prev pointer
        Node current = head;
        Node prev = null;

        for(int i = 1 ; i < pos ; i++) { 
				//if adding beyond the list elements, then stop traversing on null
				if(current == null)
				     break; 
				prev = current; //prev will always be behind of current check iteration wise
				current = current.next; 
		}
        newNode.next = current;
        newNode.prev = prev;
        prev.next = newNode;
        //check
        if(current != null) {
        current.prev = newNode;
        }
    }

        public void delFirst() {
        //if list is empty, do nothing
            if(head == null)
                return ;
        //if list has single element, make head null
            else if(head.next == null)
                head = null;
            else {
            //take head to the next node and make new head's prev null
            head = head.next;
            head.prev = null;
            }
        }

        public void delpos(int pos){
        // if list is empty or delete at first pos, then call delFirst()
            if(head == null || pos == 1)
                delFirst();
            //deleting before pos 1, then do nothing
            else if(pos<1)
                return ;
            else {
                Node current = head;
                //traverse till the pos
                // if we want to delete 3 node then traverse till 2 then come out of loop and then execute instructions mentioned below
                for(int i = 1; i<pos; i++) {
                    if(current == null)
                        return;
                    current = current.next;
                }
                current.prev.next = current.next; 
			    if(current.next != null) {
				current.next.prev = current.prev; 
			    }
            }
        }

        public void delAll() {
            head = null;
        }
        public void delLast() {

        if (head == null)
        return;

        Node current = head;

        while (current.next != null) {
        current = current.next;
        }

        current.prev.next = null;
        
    }
}

public class Program{
    public static void main(String[] args) {
        DoubleLinearList dl = new DoubleLinearList();
        dl.addLast(10);
        dl.addLast(20);      
        dl.addLast(30);
        dl.addLast(40);
        dl.addFirst(5);

        dl.fwdDisplay();
        //dl.revDisplay();
        System.out.println();
        dl.addAtpos(3, 60);
        dl.fwdDisplay();
        System.out.println(); // for space
        System.out.println("After deleting first node :");
        dl.delFirst();
        dl.fwdDisplay();
        System.out.println();
        dl.delLast();
        dl.fwdDisplay();
    }
}