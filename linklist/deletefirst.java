package linklist;

public class deletefirst{
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
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void delete(){
        if(head == null){
            System.out.println("empty");
            return;
        }
         
        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
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
        deletefirst list = new deletefirst();
        list.add(10);
        list.add(20);
        list.add(30);
        
        System.out.println("Original List:");
        list.display();

        list.delete();

        System.out.println("After Deleting Last Node:");
        list.display();
    }
}