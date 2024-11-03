package collectionframework.queue;

import java.util.PriorityQueue;

public class JavaPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Object> pq = new PriorityQueue();
        pq.add("Rob");
        pq.add("Mike");
        pq.add("Ross");
        pq.add("Jake");
        pq.add("Jake");

        for ( Object e : pq){
            System.out.println(e);
        }

        //peek() allows to peek on the first item without removing
        System.out.println(pq.peek());

        //poll() allows to peek on the first item while removing the item
        System.out.println(pq.poll());

        System.out.println("***********");
        pq.remove();
        for ( Object e : pq){
            System.out.println(e);
        }
        System.out.println("");

    }
}
