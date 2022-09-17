package Lessons.OOP.Lesson02.Ex001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        Worker worker = new Worker("Иванов", "Батут", 1, 99999999);

        // Iterator<Object> components = worker.iterator(); don't create iterator

    }
}
