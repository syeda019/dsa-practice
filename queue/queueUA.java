package queue;

public class queueUA {
    int[] queue ;
    int front = -1;
    int rear = -1;

    queueUA(int size){
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return rear == -1;
    }
    public void Enqueue(int value){
        if(rear == queue.length-1){
            System.out.println("queue overflow");
            return;
        }
        rear++;
        queue[rear] = value;
    }
    //dequeue -> O(n)
    public int  Dequeue(){
        if(isEmpty()){
            System.out.println("queue undeflow");
            return -1; 
        }
        int frontValue = queue[0];
        for(int i=0; i<rear; i++){
             queue[i] = queue[i+1];
        }
        rear--;
        return frontValue;
    }
    public int  peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return queue[0];
    }
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = 0; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println(" end ");
    }

 
    public static void main(String[] args) {
        queueUA q = new queueUA(4);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
          // Display
        System.out.println("Queue:");
        q.display();

        // Peek
        System.out.println("Peek: " + q.peek());

        // Dequeue
        System.out.println("Deleted: " + q.Dequeue());

        // Display after deletion
        System.out.println("Queue after Dequeue:");
        q.display();

        // Another Dequeue
        System.out.println("Deleted: " + q.Dequeue());

        System.out.println("Queue after Dequeue:");
        q.display();
        
    }
    
}
