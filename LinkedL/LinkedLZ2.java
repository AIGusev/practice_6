package practice_6.LinkedL;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedLZ2 {
    public static void main(String[] args) {
        Queue<String> strings = new LinkedList<>();

        strings.add("Задача 1");
        strings.add("Задача 2");
        strings.add("Задача 3");


        System.out.println("Берем задачу в работу: " + strings.poll());
        System.out.println("Оставшиеся задачи: " + strings);

        System.out.println("Берем задачу в работу: " + strings.poll());
        System.out.println("Оставшиеся задачи: " + strings);

        System.out.println("Берем задачу в работу: " + strings.poll());
        System.out.println("Оставшиеся задачи: " + strings);
    }
}
