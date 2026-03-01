package practice_6.PriorityQ;

import java.util.PriorityQueue;

public class PriorityQZ1 {
    static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(10);
        priorityQueue.offer(8);
        priorityQueue.offer(1);
        priorityQueue.offer(7);
        priorityQueue.offer(4);

        while (!priorityQueue.isEmpty())
            System.out.println(priorityQueue.poll());

    }
}


