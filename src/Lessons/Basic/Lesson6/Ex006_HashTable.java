package Lessons.Basic.Lesson6;

import java.util.Hashtable;
import java.util.Map;

public class Ex006_HashTable {
    public static void main(String[] args) {
        Map<Integer, String> table = new Hashtable<>();
        table.put(1, "two");
        table.put(11, "one one");
        table.put(2, "one");
        System.out.println(table);
        // table.put(null, "one"); can't save null!
    }
}
