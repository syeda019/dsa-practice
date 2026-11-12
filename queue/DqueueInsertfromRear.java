package queue;

public class DqueueInsertfromRear {
    int[] arr;
    int front = -1;
    int rear = -1;
    int size;

    DqueueInsertfromRear(int size){
        arr = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return front == -1;
    }
    public boolean isFull(){
        return (front == 0 && rear == size -1) || (front == rear + 1);
    }
    public void insertRear(int value){
        if(isFull()){
            System.out.println("Dqueue is full");
            return;
        }
        if(isEmpty()){
            front = 0;
            rear = 0;
        }
        else{
            rear = (rear + 1) % size;
        }
        arr[rear] = value;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Dqueue is empty");
            return;
        }
        int i = front;
        while(true){
            System.out.print(arr[i] + " ");
            if(i == rear){
                break;
            }
            i = (i + 1) % size;
        }
        System.out.println();
    }
    public static void main(String[] args){
        DqueueInsertfromRear q = new DqueueInsertfromRear(5);
        q.insertRear(1);
        q.insertRear(2);
        q.insertRear(3);
        q.insertRear(4);

        q.display();


    }
    
}
