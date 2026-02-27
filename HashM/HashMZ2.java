package practice_6.HashM;

import java.util.HashMap;

public class HashMZ2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Artem", 31);
        hashMap.put("Tanya", 32);
        hashMap.put("Pavel", 31);
        hashMap.put("Anton", 19);
        hashMap.put("Oleg", 40);
        System.out.println(hashMap.containsKey("Artem"));
    }
}
