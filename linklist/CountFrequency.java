package linklist;

public class CountFrequency {
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
            System.out.println("empty list");
            return;
        }
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void count(int value){
        Node temp = head;
        int count = 0;
        if(head==null){
            System.out.println("empty");
            return;
        }
        while(temp != null){
            if(temp.data == value){
                count++;
            }
            temp = temp.next;
        }
        System.out.println("frequency :" + value + " "+ "=" + " " + count);
    }
    public static void main(String[] args){
        CountFrequency list = new CountFrequency();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(40);
        System.out.println("before");
        list.display();

        list.count(10);
        
    }
    
}
