package queue;
import java.util.*;
// FIFO follow karti hai (First In, First Out).
// Elements insert aur remove karne ke liye offer() aur poll() use hote hain.
// offer() — element insert karta hai.
// poll() — front element remove karta hai.
// peek() — front element ko bina remove kiye show karta hai.
public class BuildinLinklistASqueue extends push {

    public static void main(String[] args) {

        push p = new push();

        p.Push(10);
        p.Push(20);
        p.Push(30);
        p.Push(40);

        System.out.print("Stack: ");

        for (int i = p.top; i >= 0; i--) {
            System.out.print(p.stack[i] + " ");
        }
        System.out.println();

        Queue<Integer> q = new LinkedList<>();

        // Insert elements
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        // Display queue
        System.out.println("Queue: " + q);

        // Front element
        System.out.println("Front: " + q.peek());

        // Delete element
        System.out.println("Deleted: " + q.poll());

        // Display after deletion
        System.out.println("Queue: " + q);

        // Size
        System.out.println("Size: " + q.size());

        // Check empty
        System.out.println("Is Empty: " + q.isEmpty());
    }
}