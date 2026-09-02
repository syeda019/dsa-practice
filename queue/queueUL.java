package queue;

public class queueUL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node front = null;
    Node rear = null;

    public boolean isEmpty(){
        return rear == null && front == null;
    }
    public void Enqueue(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;    
    }
    public int Dequeue(){
        if(isEmpty()){
            System.out.println("queue underflow");
            return -1;
        }
        int value = front.data;
        front = front.next;

        return value;
    }
    public void display(){
        Node temp = rear;
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        while(temp != null){
           System.out.print(temp.data + " "); 
           temp = temp.next;
        }
        System.out.println();
    }  
        public static void main(String[] args){
        queueUL q = new queueUL();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.display();
    }
    
}
