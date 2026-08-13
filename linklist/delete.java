package linklist;


public class delete {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void addfirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void deletelast(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next==null){
            secondlast = secondlast.next;
            lastNode = lastNode.next;
        }
        secondlast.next = null;
    }

    public void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        
    }
    public static void main(String[] args){
        delete list = new delete();
        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(30);
        
        System.out.println("Original List:");
        list.display();

        list.deletelast();

        System.out.println("After Deleting Last Node:");
        list.display();
    }
    
}
