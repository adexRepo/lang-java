package learn.lang.collection.application;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {

    public static void main(String[] args) {

        // NOTE LIFO
        Deque<String> stacks = new ArrayDeque<>();
        stacks.offerLast("1");
        stacks.offerLast("2");
        stacks.offerLast("3");
        stacks.offerLast("4");
        stacks.offerLast("5"); 

        System.out.println(stacks.pollLast()); // 5
        System.out.println(stacks.pollLast());
        System.out.println(stacks.pollLast());
        System.out.println(stacks.pollLast());
        System.out.println(stacks.pollLast()); // 1

        System.out.println("------------");

        // NOTE FIFO
        Deque<String> antrian = new ArrayDeque<>();
        antrian.offerLast("1"); 
        antrian.offerLast("2");
        antrian.offerLast("3");
        antrian.offerLast("4");
        antrian.offerLast("5"); 

        System.out.println(antrian.pollFirst()); // 1
        System.out.println(antrian.pollFirst());
        System.out.println(antrian.pollFirst());
        System.out.println(antrian.pollFirst());
        System.out.println(antrian.pollFirst()); // 5

    }

}
