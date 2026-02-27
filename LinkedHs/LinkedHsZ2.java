package practice_6.LinkedHs;

import java.util.LinkedHashSet;

public class LinkedHsZ2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        int noDub = 1;

        if (set.add(4)) {
            System.out.println("Число добавлено");
        } else {
            System.out.println("Такое число уже есть");
        }

    }

}
