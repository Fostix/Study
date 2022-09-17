package Lessons.Basic.Lesson6;

import java.util.HashMap;
import java.util.Map;

public class Ex001HashMap {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "one");
        db.putIfAbsent(null, "one");
        db.putIfAbsent(1, "one");
        db.putIfAbsent(1, "one");
        db.put(2, "two");
        db.put(null, "!null");
        db.put(null, "!nul5");
        db.put(null, "eer");
        System.out.println(db);
        System.out.println(db.get(44));
        // db.remove(null);
        System.out.println(db.containsValue("one"));
        System.out.println(db.containsValue("oe") + " - not value");
        System.out.println(db.containsKey(1));
        System.out.println(db.containsKey(10) + " - not key");
        System.out.println(db.keySet() + " - key set");
        System.out.println(db.values() + " - values");
        System.out.println(db);

    }
}
