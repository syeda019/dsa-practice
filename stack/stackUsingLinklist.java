package stack;
 public class stackUsingLinklist{
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // top of stack
    Node top = null;
    public boolean isEmpty() {
        return top == null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return;
        }
        System.out.println(top.data + " " + "popped");
        top = top.next;
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("stack is empty:");
            return;
        }
        System.out.println("Top element:" + top.data);
    }
    public void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        stackUsingLinklist list = new stackUsingLinklist();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.display();
        list.pop();

        list.peek();
    }
}