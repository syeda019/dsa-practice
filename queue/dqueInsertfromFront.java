package queue;

public class dqueInsertfromFront {
    int[] arr;
    int front = -1;
    int rear = -1;
    int size;
    dqueInsertfromFront(int size){
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
    public void insertfront(int value){
        if(isFull()){
            System.out.println("Dqueue is full");
            return;
        }
        if(isEmpty()){
            front = 0;
            rear = 0;
        }
        else{
            front = (front - 1 + size) % size;
        }
        arr[front] = value;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
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
        dqueInsertfromFront q = new dqueInsertfromFront(5);
        q.insertfront(1);
        q.insertfront(2);
        q.insertfront(3);
        q.insertfront(4);

        q.display();


    }
    
}
