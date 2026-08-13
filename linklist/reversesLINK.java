package linklist;

public class reversesLINK {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add First
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Display
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Reverse Linked List
    public void reverse() {

        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {

            next = curr.next;      // Save next node

            curr.next = prev;      // Reverse link

            prev = curr;           // Move prev forward

            curr = next;           // Move curr forward
        }

        head = prev;
    }

    public static void main(String[] args) {

        reversesLINK  list = new reversesLINK();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original Linked List:");
        list.display();

        list.reverse();

        System.out.println("Reversed Linked List:");
        list.display();
    }
    
}
