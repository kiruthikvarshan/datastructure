package stack;
class StackArray {
    int arr[];
    int top;
    int capacity;
    StackArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; 
    }
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = x;
        System.out.println(x + " pushed onto the stack.");
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        System.out.println(arr[top] + " popped from the stack.");
        return arr[top--];
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public int size() {
        return top + 1;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("Stack size: " + stack.size());
    }
}
