package practice_6.LinkedHs;

import java.util.LinkedHashSet;

public class LinkedHsZ1 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Строка 3");
        set.add("Строка 1");
        set.add("Строка 2");
        set.add("Строка 5");
        set.add("Строка 4");
        System.out.println(set);
    }
}
