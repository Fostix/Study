package Lessons.OOP.Lesson03.Ex003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

//        var el = Methods.getElementFromIntegerCollection(data, 1);
//        System.out.println(el);
//        el = Methods.<Integer>getElementFromUCollection(data, 2);
//        el = Methods.getElementFromUCollection(data,  2);
//        System.out.println(el);
        // На сложных или собственных типах идея такая же
        // только придётся делать перегрузку некоторых методов (hashCode, equals????)


        Integer t = Methods.<Integer>getElementFromUCollection(data, 1);
        Integer t1 = Methods.getElementFromUCollection(data, 0);
        System.out.println(t);
        System.out.println(t1);

        List<String > dataStr = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
        String t2 = Methods.getElementFromUCollection(dataStr, 2);
        System.out.println(t2);
    }
}
