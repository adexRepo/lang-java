package learn.lang.collection.application;

// import java.util.ArrayDeque;
// import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    
    public static void main(String[] args) {
        
        // Queue<String> queue = new ArrayDeque<>(); // by default is 10, but if add more that array will grow
        Queue<String> queue = new PriorityQueue<>();
        // Queue<String> queue = new LinkedList<>();
        queue.offer("Adex");
        queue.offer("Krist");
        queue.offer("Tiyanto");
        queue.offer("Bob");

        for (String string : queue) {
            System.out.println(string);
        }
        System.out.println("queue.size() before poll: "+queue.size());
        System.out.println("--------------------------------");
        for (String next = queue.poll(); next != null ; next =queue.poll()) {
            System.out.println(next);
        }
        System.out.println("queue.size() after poll : "+queue.size());
    }

}
