package queue;

public class getFrontRearUA {
    int[] queue;
    int front = -1;
    int rear = -1;

    getFrontRearUA(int size){
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return rear == -1 && front == -1;
    }
    public void Enqueue(int value){
        if(rear == queue.length-1){
            System.out.println("queue overflow");
            return;
        }
        rear++;
        queue[rear] = value;
    }

    // Find front and rear
    public int getfront(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[0];
    }

    public int getRear(){
        if(isEmpty()){
            System.out.println("queue empty");
            return -1;
        }
        return queue[rear];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        for(int i=0; i<=rear; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        getFrontRearUA q = new getFrontRearUA(5);
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.display();
        System.out.println("front" + " "+ q.getfront());
        System.out.println("Rear" +" "+q.getRear());

    }
    
}
