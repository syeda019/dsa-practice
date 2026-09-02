package queue;

public class reverseUL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node rear = null;
    Node front = null;
    public boolean isEmpty(){
        return rear == null && front == null;
    }

    public void Enqueue(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public void reverse(){
        if(isEmpty()){
            System.out.println("queue empty");
            return;
        }
        Node prev = null;
        Node curr = front;
        Node next;

        Node oldfront = front;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        front = prev;
        rear = oldfront;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("queue  is empty");
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        reverseUL q = new reverseUL();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        System.out.println("original:");
        q.display();
        q.reverse();
        System.out.println("reversed:");
        q.display();

    }
    
}
