package Lessons.Basic.Lesson5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex004Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(7);
        deque.addFirst(4);
        deque.addFirst(5);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.offerFirst(21);
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
    }
}
