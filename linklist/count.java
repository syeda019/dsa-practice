package linklist;

public class count{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void addLast(int data) {

    Node newNode = new Node(data);   // Create a new node

        if (head == null) {              // If the list is empty
            head = newNode;              // Make the new node the head
            return;
        }

        Node temp = head;                // Start from the first node

        while (temp.next != null) {      // Move until the last node
            temp = temp.next;
        }

         temp.next = newNode;             // Connect the new node at the end
    }
     // Count nodes
    public int countNodes() {
        int count = 0;
        Node current = head;             // current bi likh sakta ha aur temp bi

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    
    public static void main(String[] args){
        count list = new count();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.display();

        System.out.println("Number of nodes: " + list.countNodes());
    }
}