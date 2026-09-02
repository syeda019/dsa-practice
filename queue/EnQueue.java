package queue;
public class EnQueue{
    int[] queue = new int[5];
    int front = -1;
    int rear = -1;
    public void enqueue(int value){
        if(rear == queue.length-1){
            System.out.println("queue overflow");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear++;
        queue[rear] = value;
    }
    public void display(){
        if(front == -1 || front > rear){
            System.out.println("queue is empty");
            return;
        }
        System.out.print("front" + " ");
         for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + "  ");
        }

        System.out.println("rear");
    }
    
    public static void main(String[] args) {
        EnQueue q = new EnQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
    }
}