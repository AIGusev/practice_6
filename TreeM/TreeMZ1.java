package practice_6.TreeM;

import java.util.TreeMap;

public class TreeMZ1 {
    static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Artem", 100);
        treeMap.put("Viktor", 99);
        treeMap.put("Sergey", 10);
        treeMap.put("Pavel", 85);
        treeMap.put("Andrey", 19);
        System.out.println(treeMap);
        //Отсортировал по ключу

    }
}
