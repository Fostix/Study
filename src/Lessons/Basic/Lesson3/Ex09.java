package Lessons.Basic.Lesson3;

import java.util.ArrayList;
import java.util.List;

public class Ex09 {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = List.of('A', 'l', 'b', 'e', 'r', 't');
        System.out.println(list1);
        // list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);

        Character   value1 = null;
        List<Character> list3 = new ArrayList<Character>();
        list3.add('A');
        list3.add('l');
        list3.add('b');
        list3.add('e');
        list3.add('r');
        list3.add('t');
        System.out.println(list3);
        list3.remove(1);
        System.out.println(list3);

        List<Character> list4 = List.copyOf(list3);
        System.out.println(list4);
    }
}
