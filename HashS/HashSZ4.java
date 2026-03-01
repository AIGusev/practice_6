package practice_6.HashS;

import java.util.HashSet;

public class HashSZ4 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Артем");
        hashSet.add("Татьяна");
        hashSet.add("Григорий");
        hashSet.add("Виктор");
        hashSet.add("Дмитрий");


        String myName = "Таня"; // Выведет: Такого имени нет

        if (hashSet.contains(myName)) {
            System.out.println("Такое имя есть");
        } else {
            System.out.println("Такого имени нет");
        }
    }
}
