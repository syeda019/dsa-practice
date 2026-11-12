package queue;
public class DoublyqueueUA {

    int[] queue;
    int front = -1;
    int rear = -1;

    DoublyqueueUA(int size) {
        queue = new int[size];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == queue.length - 1)
                || (front == rear + 1);
    }

    // Enqueue from Rear
    public void EnqueueRear(int value) {
        if (isFull()) {
            System.out.println("Queue overflow");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else if (rear == queue.length - 1) {
            rear = 0;
        } else {
            rear++;
        }

        queue[rear] = value;
    }

    // Enqueue from Front
    public void EnqueueFront(int value) {
        if (isFull()) {
            System.out.println("Queue overflow");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else if (front == 0) {
            front = queue.length - 1;
        } else {
            front--;
        }

        queue[front] = value;
    }

    // Dequeue from Front
    public int DequeueFront() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }

        int frontValue = queue[front];

        if (front == rear) {
            front = rear = -1;
        } else if (front == queue.length - 1) {
            front = 0;
        } else {
            front++;
        }

        return frontValue;
    }

    // Dequeue from Rear
    public int DequeueRear() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }

        int rearValue = queue[rear];

        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = queue.length - 1;
        } else {
            rear--;
        }

        return rearValue;
    }

    // Peek Front
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % queue.length;
        }

        System.out.println("end");
    }

    public static void main(String[] args) {

        DoublyqueueUA q = new DoublyqueueUA(4);

        q.EnqueueRear(10);
        q.EnqueueRear(20);
        q.EnqueueRear(30);
        q.EnqueueFront(5);

        System.out.println("Queue:");
        q.display();

        System.out.println("Peek: " + q.peek());

        System.out.println("Deleted from Front: "
                + q.DequeueFront());

        System.out.println("Deleted from Rear: "
                + q.DequeueRear());

        System.out.println("Queue after deletion:");
        q.display();
    }
}

