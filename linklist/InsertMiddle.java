package linklist;

public class InsertMiddle {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insertfirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void insertMiddle(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        newNode.next = slow.next; // slow ka next par newNode add ho gi
        slow.next = newNode;
    }
    public void display(){

    if(head == null){
        System.out.println("empty");
        return;
    }

    Node temp = head;

    while(temp != null){
        System.out.print(temp.data + "->");
        temp = temp.next;
    }

    System.out.println("null");
}
    public static void main(String[] args){
        InsertMiddle list = new InsertMiddle();
        list.insertfirst(10);
        list.insertfirst(20);
        list.insertfirst(30);
        list.insertfirst(40);
        list.display();
        list.insertMiddle(25);
        list.display();


    }
}
