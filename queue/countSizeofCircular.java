package queue;

public class countSizeofCircular {
    int[] arr;
    int front = -1;
    int rear = -1;
    int size;

    countSizeofCircular(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void Enqueue(int value) {
        if (isFull()) {
            System.out.println("queue is empty");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
            System.out.println("rear is moved to index:" + rear);
        }
        arr[rear] = value;
    }

    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("queue underflow");
            return -1;
        }
        int value = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return value;
    }

    public int CountSize() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        int count = 0;
        int i = front;
        while (i != rear) {
            count++;
            i = (i + 1) % size;
        }
        count++;
        return count;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("queue is Empty");
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

    public static void main(String[] args) {
        countSizeofCircular q = new countSizeofCircular(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        System.out.println("Queue size: " + q.CountSize());
        q.display();

    }

}
