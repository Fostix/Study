package Lesson03.Ex001;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // ##region type  save
        //List<String> list = new ArrayList<String>();
        // List<String> list = new ArrayList<>();
        // new ArrayList<>(); != new ArrayList();


        List list = new ArrayList(); // Можно добавить цифры, но проверка длины строк не сработает. Для избегать добавить обощение
        // с помощью угловых скобок.

        for (int i = 1; i <= 5; i++) {
            list.add(String.format("string %d", i));
        }

        System.out.println(list);
        // System.out.println(allLength(list));
    }

}
