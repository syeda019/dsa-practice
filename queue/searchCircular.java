package queue;

public class searchCircular {
    int[] arr;
    int front = -1;
    int rear = -1;
    int size;

    searchCircular(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }
    public boolean isFull(){
        return (rear + 1)% size == front;
    }

    public void Enqueue(int value) {
        if (isFull()) {
            System.out.println("queue is full");
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

    public void search(int value) {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        while (true) {
            if (arr[i] == value) {
                System.out.println(value + " found at index " + i);
                return ;
            }

            if (i == rear) {
                break;
            }

            i = (i + 1) % size;
        }

        System.out.println(value + " not found");
        
    }
    public void dispaly(){
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

    public static void main(String[] args) {
        searchCircular q = new searchCircular(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.dispaly();
        q.search(3);

    }

}
