package stack;

public class popUL{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    Node head = null;
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public int pop(){
        if(head==null){
            System.out.println("stack underflow");
            return -1;
        }
        int value = head.data;
        head = head.next;
        return value;
    }
    public int peek(){
        if(head==null){
            System.out.println("stack is empty");
            return -1;
        }
        return head.data;
    }
    public void display(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public static void main(String[] args){
        popUL p = new popUL();
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        System.out.println("Stack before pop:");
        p.display();

    // Sirf 2 elements pop
        for(int i = 0; i < 2; i++){
           System.out.println("Popped: " + p.pop());
        }

        System.out.println("Stack after pop:");
        p.display();
      
    }
}