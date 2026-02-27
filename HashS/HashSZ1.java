package practice_6.HashS;

import java.util.HashSet;
import java.util.Objects;

public class HashSZ1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(5);
        hashSet.add(8);
        hashSet.add(1);
        hashSet.add(10);
        hashSet.add(5);

        System.out.println(hashSet);
    }
}
