package linklist;
public class CircularLinklistUL{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        newNode.next = head;
        head = newNode;
        temp.next = head;     //ya head ko point kara ga 
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next= newNode;
        newNode.next = head;
    }
    public void display(){
        if(head == null){
            System.out.println("enpty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }
    public static void main(String[] args){
        CircularLinklistUL list = new CircularLinklistUL();
        list.addlast(10);
        list.addlast(20);
        list.addlast(30);

        list.display();
        list.addfirst(5);
        list.display();

    }
}