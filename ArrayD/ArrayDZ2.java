package practice_6.ArrayD;

import java.util.ArrayDeque;

public class ArrayDZ2 {
    static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);
        arrayDeque.add(4);
        arrayDeque.add(5);
        arrayDeque.add(6);
        System.out.println(arrayDeque);
        arrayDeque.push(7);
        arrayDeque.push(8);
        System.out.println(arrayDeque.getLast());
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque);
    }
}
