package linklist;
public class add{
    class Node {
        int data;
        Node next;

        Node(int d){
           data = d;
           next = null;
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


public void display() {
    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }

    System.out.println("null");
}
    
   
    public  static void main(String[] args){
        add list = new add();
        list.addLast(10);
        list.addLast(20);
        
        System.out.println("Before Adding:");
        list.display();

        // Add another number at the end
        list.addLast(40);

        System.out.println("After Adding:");
        list.display();
        
    }
}
