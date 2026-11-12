package linklist;

public class CircularSingly {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node tail = null;

    // Append: new node ko end par add karna
    public void append(int data) {

        Node newNode = new Node(data);

        // Agar list empty hai
        if (tail == null) {
            tail = newNode;

            // Circular connection
            tail.next = tail; //ya tab hota ha jab circular linklist mein sirf 1 node ho

            return;
        }

        // New node ka next first node par
        newNode.next = tail.next;

        // Old tail ka next new node par
        tail.next = newNode;

        // New node ko tail bana do
        tail = newNode;
    }

    // Display
    public void display() {

        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail.next; // First node

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(Back to First)");
    }

    // Main method
    public static void main(String[] args) {

        CircularSingly list = new CircularSingly();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Circular Singly Linked List:");
        list.display();
    }
}