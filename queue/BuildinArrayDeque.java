package queue;
import java.util.*;
// Dono ends se elements insert aur remove kar sakte hain.
// Queue aur Deque (double-ended queue) dono ki tarah use hoti hai.
// offerFirst() — front par insert karta hai.
// offerLast() — rear par insert karta hai.
// pollFirst() — front se remove karta hai.
// pollLast() — rear se remove karta hai.
public class BuildinArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> q = new ArrayDeque<>();

        // Insert from rear
        q.offerLast(10);
        q.offerLast(20);
        q.offerLast(30);

        System.out.println("Queue: " + q);

        // Insert from front
        q.offerFirst(5);

        System.out.println("After front insertion: " + q);

        // Check front and rear
        System.out.println("Front: " + q.peekFirst());
        System.out.println("Rear: " + q.peekLast());

        // Delete from front
        System.out.println("Deleted front: " + q.pollFirst());

        // Delete from rear
        System.out.println("Deleted rear: " + q.pollLast());

        System.out.println("Final Queue: " + q);
    }
}

