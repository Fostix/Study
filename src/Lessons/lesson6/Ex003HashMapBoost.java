package Lessons.lesson6;

import java.util.HashMap;
import java.util.Map;

public class Ex003HashMapBoost {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>(9);
        Map<Integer, String> map3 = new HashMap<>(9, 1.0f);
        Map<Integer, String> map4 = new HashMap<>(9, 0.7f);
        System.out.println(0.7f);
    }
}
