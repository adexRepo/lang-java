package learn.lang.collection.application;

import java.util.Queue;

import learn.lang.collection.collection.SingleQueue;

public class SingleQueueApp {
    public static void main(String[] args) {
        
        Queue<String> singleQue = new SingleQueue<>();
        singleQue.offer("adex1");
        singleQue.offer("adex2"); // reject coz data not null
        singleQue.offer("adex3"); // reject coz data not null

        System.out.println("singleQue.size() : "+singleQue.size());
        System.out.println("singleQue.peek() : "+singleQue.peek());
        System.out.println("singleQue.poll() : "+singleQue.poll());
        System.out.println("singleQue.poll() : "+singleQue.poll());
        System.out.println("singleQue.size() : "+singleQue.size());
    }
}
