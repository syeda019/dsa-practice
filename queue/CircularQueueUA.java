package queue;
public class CircularQueueUA{
    int[] arr ;
    int front = -1;
    int rear = -1;
    int size;
    CircularQueueUA(int size){
        arr = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return  front == -1;
    }

    public boolean isFull(){
        return (rear + 1)% size == front;
    }

    public void Enqueue(int value){
        if(isFull()){
            System.out.println("queue full");
            return;
        }
        if(isEmpty()){
            front = 0;
            rear = 0;
        }
        else{
            rear = (rear + 1) % size;
            System.out.println("Rear moved to index: " + rear);
        }
        arr[rear] = value;
    }

    public void Dequeue(){
        if(isEmpty()){
            System.out.println("queue empty");
            return;
        }
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front = (front +1) % size;
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("front element:" + arr[front]);
    }
    public void display(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(arr[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % size;
        }

        System.out.println();
    
    }
    public static void main(String[] args){
        CircularQueueUA q = new CircularQueueUA(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        q.display();
        q.peek();

        q.Dequeue();
        q.Dequeue();
        q.display();

        q.Enqueue(6);
        q.display();
        q.Enqueue(7);

        q.display();
        
    }
}