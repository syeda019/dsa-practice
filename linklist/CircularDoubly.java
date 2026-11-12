package linklist;
public class CircularDoubly {

    // Node class
    class Node {
        int data;
        Node next;     // import java.util.ll
        Node prev;     // build in linklist use karni display bi karna ha 
                       // build in stack use karni ha 

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
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
            tail.next = tail;
            tail.prev = tail;

            return;
        }

        // First node
        Node first = tail.next;

        // New node ki connections
        newNode.next = first;
        newNode.prev = tail;

        // Old tail ka next new node
        tail.next = newNode;

        // First node ka previous new node
        first.prev = newNode;

        // New node ko tail bana do
        tail = newNode;
    }

    // Forward display
    public void displayForward() {

        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail.next; // First node

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(First)");
    }

    // Backward display
    public void displayBackward() {

        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        } while (temp != tail);

        System.out.println("(Tail)");
    }

    // Main method
    public static void main(String[] args) {

        CircularDoubly list = new CircularDoubly();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        System.out.println("Forward:");
        list.displayForward();

        System.out.println("Backward:");
        list.displayBackward();
    }
}