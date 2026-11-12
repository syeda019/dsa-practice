package linklist;

public class CircularSinglySorted {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node tail;
    public void append(int data) {

    Node newNode = new Node(data);

    // Agar list empty hai
    if (tail == null) {
        tail = newNode;
        tail.next = tail;
        return;
    }

    Node head = tail.next;

    // Agar new data sab se chota hai
    if (data <= head.data) {
        newNode.next = head;
        tail.next = newNode;
        return;
    }

    // Correct position find karna
    Node current = head;

    while (current.next != head && current.next.data < data) {
        current = current.next;
    }

    // New node insert
    newNode.next = current.next;
    current.next = newNode;

    // Agar new node sab se bara hai to tail update
    if (current == tail) {
        tail = newNode;
    }
}
public void display(){
     if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail.next; //head

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(Tail)");
}
    public static void main(String[] args){
        CircularSinglySorted list = new CircularSinglySorted();
        list.append(10);
        list.append(4);
        list.append(20);
        list.append(18);
        list.display();

    }
    
}
