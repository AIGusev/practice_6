package practice_6.PriorityQ;

import java.util.PriorityQueue;

public class PriorityQZ1 {
    static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        /*priorityQueue.add(8);
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(9);
        priorityQueue.add(7);
        System.out.println(priorityQueue);*/
        //Немного не понимаю, почему он делает странный порядок. 1, 7, 5, 9, 8

        priorityQueue.offer(10);
        priorityQueue.offer(8);
        priorityQueue.offer(1);
        priorityQueue.offer(7);
        priorityQueue.offer(4);

        while (!priorityQueue.isEmpty())
            System.out.println(priorityQueue.poll());

        //Тут тоже странный порядок

    }
}

