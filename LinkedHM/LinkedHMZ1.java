package practice_6.LinkedHM;

import java.util.LinkedHashMap;

public class LinkedHMZ1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Мой номер", 8968);
        map.put("Мама", 8969);
        map.put("Папа", 8970);
        map.put("Жена", 8888);
        map.put("Брат", 8777);

        System.out.println(map);
    }
}
