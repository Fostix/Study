package Lessons.lesson5;

import java.util.LinkedList;
import java.util.Queue;

public class Ex002QueueFIFO {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>(); //FIFO.
        // разбросаны в памяти.
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);

        int item = queue.remove();
        int item1 = queue.remove();
        System.out.println(item);
        System.out.println(item1);

    }
}
