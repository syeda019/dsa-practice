package stack;

public class ReverseStringUL {
    class Node{
        char data;
        Node next;
        Node(char data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void push(char data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public char pop(){
        if(head == null){
            System.out.println("stack underflow");
            return '\0';
        }
        char value = head.data;
        head = head.next;
        return value;
    }
    
    public void reverse(String str){
        for(int i = 0; i <str.length(); i++){
            push(str.charAt(i));
        }
        System.out.println("reversed:");

        while(head!= null){
            System.out.println(pop());
        }
        System.out.println();
    }
    public static void main(String[] args){
        ReverseStringUL list = new ReverseStringUL();
        String str = "fatima";
        list.reverse(str);
    }
    
}
