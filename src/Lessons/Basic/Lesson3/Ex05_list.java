package Lessons.Basic.Lesson3;

import java.util.ArrayList;

public class Ex05_list {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>(); // Что бы не дублировать информацию.
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);
    }
}
