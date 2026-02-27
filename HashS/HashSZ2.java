package practice_6.HashS;

import java.util.HashSet;

public class HashSZ2 {
    static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(7);
        hashSet.add(1);
        hashSet.add(0);
        hashSet.add(5);
        hashSet.add(12);
        hashSet.add(11);
        hashSet.add(65);
        hashSet.add(43);
        hashSet.add(501);
        hashSet.add(500);
        System.out.println(hashSet.contains(11));

    }
}
