package Lessons.lesson6;

import java.util.TreeMap;

public class Ex004_TreeMap {
    public static void main(String[] args) {
        // TreeMap в основе лежать красно-чёрные деревья.
        TreeMap<Integer, String > tMap = new TreeMap<>();
        tMap.put(1, "one");
        System.out.println(tMap);
        tMap.put(6, "six");
        System.out.println(tMap);
        tMap.put(1, "four");
        System.out.println(tMap);
        tMap.put(4, "four");
        System.out.println(tMap);
        tMap.put(3, "three");
        System.out.println(tMap);
        tMap.put(2, "two");
        System.out.println(tMap);
        var item = tMap.get(2);
        System.out.println(item + " - get 2");
        System.out.println(tMap.get(2));
        tMap.remove(2);
        System.out.println(tMap + " - remove 2");
        var item2= tMap.descendingKeySet();
        System.out.println(item2 + " - descendingKeySet");
        System.out.println(tMap);
        System.out.println(tMap.descendingMap() + " - descendingMap");
        System.out.println(tMap.tailMap(1) + " - tailMap");
        System.out.println(tMap);
        System.out.println(tMap.headMap(6) + " - headMap");
        System.out.println(tMap.lastEntry() + " - lastEntry");
        System.out.println(tMap.firstEntry() + " - firstEntry");


    }
}
