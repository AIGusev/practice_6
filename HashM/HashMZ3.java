package practice_6.HashM;

import java.util.HashMap;
import java.util.Map;

public class HashMZ3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Artem", 17);
        hashMap.put("Tanya", 16);
        hashMap.put("Pavel", 31);
        hashMap.put("Anton", 19);
        hashMap.put("Oleg", 40);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println(entry.getKey());
            }
        }
    }
}
