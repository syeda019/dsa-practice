package queue;

public class reverseUA {
    int[] queue;
    int front = -1;
    int rear = -1;
    reverseUA(int size){
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return rear == -1 && front == -1;
    }
    public void Enqueue(int value){
        if(rear == queue.length - 1){
           System.out.println("queue overflow");
        }
        if(front == -1){
            front = 0;
        }
        rear++;
        queue[rear] = value;
    }
    public void reverse(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        int i = front;
        int j = rear;
        while(i<j){
            int temp = queue[i];
            queue[i] = queue[j];
            queue[j] = temp;
            i++;
            j--;
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        for(int i = 0; i<=rear; i++){
            System.err.print(queue[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        reverseUA q = new reverseUA(5);
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.reverse();
        q.display();

    }
    
}
