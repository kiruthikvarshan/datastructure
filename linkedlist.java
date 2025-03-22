package linkeedlist;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp!= null) {
            temp = temp.next;
        }
        System.out.print(temp.data + " -> ");
        // System.out.println("NULL");
    }
}
public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter numbers to insert into the linked list:");
        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            list.insert(value);
            list.display();
        }
        scanner.close();
    }
}
