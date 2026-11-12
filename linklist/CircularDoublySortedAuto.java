package linklist;
// Node class - separate class
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


// Main class
public class CircularDoublySortedAuto {

    Node tail = null;

    // Sorted append
    public void append(int data) {

        Node newNode = new Node(data);

        // List empty
        if (tail == null) {
            tail = newNode;

            tail.next = tail;
            tail.prev = tail;

            return;
        }

        Node first = tail.next;

        // New value sab se choti hai
        if (data <= first.data) {

            newNode.next = first;
            newNode.prev = tail;

            tail.next = newNode;
            first.prev = newNode;

            return;
        }

        // Correct position find karna
        Node temp = first;

        while (temp != tail && temp.next.data < data) {
            temp = temp.next;
        }

        // New value sab se bari hai
        if (temp == tail) {

            newNode.next = first;
            newNode.prev = tail;

            tail.next = newNode;
            first.prev = newNode;

            tail = newNode;

            return;
        }

        // Beech mein insert
        Node nextNode = temp.next;

        newNode.next = nextNode;
        newNode.prev = temp;

        temp.next = newNode;
        nextNode.prev = newNode;
    }


    // Display
    public void display() {

        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail.next;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;

        } while (temp != tail.next);

        System.out.println("(First)");
    }


    // Main
    public static void main(String[] args) {

        CircularDoublySortedAuto list =
                new CircularDoublySortedAuto();

        list.append(30);
        list.append(10);
        list.append(40);
        list.append(20);
        list.append(5);
        list.append(50);

        System.out.println("Sorted Circular Doubly Linked List:");

        list.display();
    }
}