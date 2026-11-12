package queue;

public class task {

    int[] arr = new int[5];
    int front = 0;
    int rear = -1;

    // Enqueue
    void enqueue(int value) {
        if (rear == arr.length - 1) {
            System.out.println("Queue is Full");
            return;
        }

        arr[++rear] = value;
    }

    // Dequeue
    int dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front++];
    }

    // Move any index element to front
    // index < front — agar index front se pehle hai to invalid hai.
    // index > rear — agar index rear se aagay hai to invalid hai.
    // return — method ko wahin stop kar deta hai.
    // front = 0;
    // rear = 4;
    // size = 4 - 0 + 1 = 5
    // +1 is liye lagaya kyunke front aur rear dono indexes count honge.
    // temp ek temporary array hai jo queue ke elements ko temporarily store karega.
    // k = 0 batata hai ke temporary array mein pehla element index 0 par store hoga
    // Is mein teen kaam ho rahe hain:
    // 1. front <= rear check karta hai ke queue mein elements baqi hain ya nahi.
    // 2. dequeue() queue ke front se element nikalta hai.
    // 3. temp[k++] nikale gaye element ko temporary array mein store karta hai,
    // phir k ko 1 se increase karta hai.
    // front = 0 — front ki initial position.
    // rear = -1 — queue empty hai; abhi koi element rear par nahi hai.
    void moveToFront(int index) {

        if (index < front || index > rear) {
            System.out.println("Invalid Index");
            return;
        }

        int size = rear - front + 1;
        int[] temp = new int[size];
        int k = 0;

        // Store all elements using dequeue
        while (front <= rear) {
            temp[k++] = dequeue();
        }

        // Reset queue
        front = 0;
        rear = -1;

        // Enqueue selected element first
        enqueue(temp[index]);

        // Enqueue elements before selected index
        // Agar index = 2 hai, to loop chalega:
        // - i = 0 → temp[0] = 10 enqueue hoga.
        // - i = 1 → temp[1] = 20 enqueue hoga.
        // - i = 2 par condition false ho jayegi, kyunke 2 < 2 false hai.
        // Ab queue:
        // [30, 10, 20]
        // Yahan i < index kyun hai? Kyunke selected element se pehle wale elements ko
        // dobara insert karna hai, selected element ko nahi.
        for (int i = 0; i < index; i++) {
            enqueue(temp[i]);
        }

        // Enqueue remaining elements
        // Agar index = 2 aur size = 5 hai, to:
        // - i = 3 → temp[3] = 40
        // - i = 4 → temp[4] = 50
        // Ab final queue:
        // [30, 10, 20, 40, 50]
        for (int i = index + 1; i < size; i++) {
            enqueue(temp[i]);
        }
    }

    // Display
    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        task q = new task();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Original Queue:");
        q.display();

        q.moveToFront(3);

        System.out.println("After Moving to Front:");
        q.display();
    }
}