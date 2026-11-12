package queue;
import java.util.*;
// Elements priority/order ke mutabiq nikalte hain.
// Default mein smallest element pehle remove hota hai.

public class BuildinPriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>();

        // Insert elements
        q.offer(30);
        q.offer(10);
        q.offer(50);
        q.offer(20);
        q.offer(40);

        System.out.println("Priority Queue: " + q);

        // Check highest priority element
        System.out.println("Front: " + q.peek());

        // Delete highest priority element
        System.out.println("Deleted: " + q.poll());

        System.out.println("Front after deletion: " + q.peek());

        // Remove all elements in priority order
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}

