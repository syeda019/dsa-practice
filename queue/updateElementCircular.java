package queue;

public class updateElementCircular {
    int[] arr;
    int front = -1;
    int rear = -1;
    int size;
    updateElementCircular(int size){
        arr = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isfull(){
        return (rear + 1) % size == front;
    }
    public void Enqueue(int value){
        if(isfull()){
            System.out.println("queue overflow");
            return;
        }
        if(isEmpty()){
            front = 0;
            rear = 0;
        }
        else{
            rear = (rear +1) % size;
        }
        arr[rear] = value;
    }
    public void update(int oldValue, int newValue){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        int i = front;
        while(true){
            if(arr[i] == oldValue){
                arr[i] = newValue;
                System.out.println("Value updated");
                return;
            }
            if(i == rear){
                break;
            }
            i = (i + 1) % size;
        }
        System.out.println("value not found");
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
        updateElementCircular q = new updateElementCircular(7);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);

        q.display();
        q.update(2, 20);
        q.display();

    }
    
}
