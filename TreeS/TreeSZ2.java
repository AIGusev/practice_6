package practice_6.TreeS;

import java.util.TreeSet;

public class TreeSZ2 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(11);
        set.add(12);
        set.add(15);
        set.add(18);
        set.add(22);
        set.add(14);

        System.out.println(set.lower(12));
        System.out.println(set.higher(12));
    }
}
