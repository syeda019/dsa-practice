package linklist;

public class deletebyValue {
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

    public void delete(int value){

       // empty
        if(head == null){
           System.out.println("empty");
           return;
        }
        if(head.data == value){
            head = head.next;
            return;
        }

        Node prev = null;
        Node curr = head;

        while(curr != null && curr.data != value){
            prev = curr;
            curr = curr.next;
        }
        if(curr == null ){
            System.out.println("not found:");
            return;
        }
        prev.next = curr.next;

    }
    public void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args){
        deletebyValue list = new deletebyValue();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Before deletion:");
        list.display();

        list.delete(30);

        System.out.println("After deletion:");
        list.display();

    }
    
}
