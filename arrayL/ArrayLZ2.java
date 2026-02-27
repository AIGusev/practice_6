package practice_6.arrayL;

import java.util.ArrayList;

public class ArrayLZ2 {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();

        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);
        number1.add(5);
        number1.add(6);
        number1.add(7);
        number1.add(8);
        number1.add(9);
        number1.add(10);

        for (Integer number : number1) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        //Можно и вот так.
        /*for (int i = 0; i < number1.size(); i ++) {
            if (i % 2 == 1) {
                System.out.println(number1.get(i));
            }
        }*/
    }
}