package practice_6.LinkedHM;

import java.util.LinkedHashMap;

public class LinkedHMZ2 {
    static void main(String[] args) {
        LinkedHashMap<String, Integer> bookNumber = new LinkedHashMap<>();

        bookNumber.put("Artem", 777);
        bookNumber.put("Tanya", 111);
        bookNumber.put("Lera", 123);
        bookNumber.put("Pavel", 789);
        System.out.println(bookNumber);

        bookNumber.put("Petya", 456);
        System.out.println(bookNumber);

        System.out.println("Номер телефона Пети: " + bookNumber.get("Petya"));

    }
}
