package queue;

public class ReverseCircular {
    int[] arr;
    int front = -1;
    int rear = -1;
    int size;

    ReverseCircular(int size) {
        arr = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void Enqueue(int value) {
        if (isFull()) {
            System.out.println("queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        arr[rear] = value;
    }

    public int CountSize() {
        if (isEmpty()) {
            return 0;
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

    public void reverse() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        int count = CountSize();
        int left = front;
        int right = rear;
        for (int i = 0; i < count / 2; i++) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left = (left + 1) % size;
            right = (right - 1 + size) % size;
        }

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
        ReverseCircular q = new ReverseCircular(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.display();

        q.reverse();
        System.out.println("reversed:");
        q.display();

    }
}
