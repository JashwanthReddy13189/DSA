package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(3);
        pq.offer(1);
        pq.offer(2);

        System.out.println(pq.poll());

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(6);
        queue.offer(3);
        queue.offer(1);
        queue.offer(2);

        System.out.println(queue.poll());
    }

}
