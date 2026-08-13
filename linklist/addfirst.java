package linklist;

public class addfirst {
    
    class Node {
        int data;
        Node next;

        Node(int d){
           data = d;
           next = null;
        }   
    }
    Node head = null;
    public void addFirst(int data) {

    Node newNode = new Node(data);

    // If the list is empty
    if (head == null) {
        head = newNode;
        return;
    }

    // Connect new node to the current head
    newNode.next = head;

    // Make new node the head
    head = newNode;
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
        addfirst list = new addfirst();
        list.addFirst(30);   // 30
        list.addFirst(20);   // 20 -> 30
        list.addFirst(10);   // 10 -> 20 -> 30

        list.display();


    }
}
