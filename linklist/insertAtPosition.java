package linklist;

public class insertAtPosition {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("empty:");
            return;
        }
        while(temp != null){
            System.out.print(temp.data +"->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public void insert(int data , int position){
        Node newNode = new Node(data);
        if(position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for(int i=0; i<position-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        
    }
    public static void main(String[] args){
        insertAtPosition list = new insertAtPosition();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("before:");
        list.display();
       
        list.insert(25, 2);
        System.out.println("After: ");
        list.display();
    }
    
}
