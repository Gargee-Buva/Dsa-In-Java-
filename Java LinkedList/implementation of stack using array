class Stack {
    private int[] arr;
    private int top;

    // Constructor to initialize the stack with a fixed size
    public Stack(int size) {
        arr = new int[size]; // Declare an array of the given size
        top = -1;            // Initialize top as -1
    }

    // Push operation: Insert an element into the stack
    public void push(int x) {
        if (top == arr.length - 1) { // Check if stack is full
            System.out.println("Stack Overflow! Cannot push " + x);
            return;
        }
        arr[++top] = x; // Increase top and insert element
        System.out.println("Pushed: " + x);
    }

    // Pop operation: Remove and return the top element
    public int pop() {
        if (top == -1) { // Check if stack is empty
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        return arr[top--]; // Return top element and decrease top
    }

    // Size operation: Return the number of elements in the stack
    public int size() {
        return top + 1;
    }

    // Display stack elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Stack size: " + stack.size());

        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}
