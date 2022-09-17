package Lessons.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Ex06_ArrayList {
    public static void main(String[] args) {

        long time = System.nanoTime();
        List list = new ArrayList(); // Сырой тип, не указан явный тип. Неявное преобразование к object.
        list.add(2809); // int преобразует в тип Object тратится больше времени
        list.add("list line");

        for (Object o :list) { System.out.println(o);
            System.out.println(o.getClass().getSimpleName()); }
        System.out.println(System.nanoTime() - time + " - time1");




        long time1 = System.nanoTime();
        ArrayList<Integer> list1 = new ArrayList<Integer>(); // Сырой тип, не указан явный тип. Неявное преобразование к object.
        list1.add(2809); // int преобразует в тип Object тратится больше времени
        list1.add(324);
        //list1.add("list line");

        for (Object o :list1) { System.out.println(o);
            System.out.println(o.getClass().getSimpleName()); }
        System.out.println(System.nanoTime() - time1 + " - time2");
    }
}
