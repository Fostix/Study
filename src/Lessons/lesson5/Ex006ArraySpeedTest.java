package Lessons.lesson5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class Ex006ArraySpeedTest { // Тест скорости удаления элемента из массива.
// Попробовать list!!!
    // linkedLIstr
    // print reverse list


    public static void main(String[] args) {

        // Array.
        long timeCreateArray = System.currentTimeMillis();
        int count = 1_000_000;
        int[] array = new int[count];
        fillArray(array);
        System.out.println(System.currentTimeMillis() - timeCreateArray + " - create and fill array!");

        long time = System.currentTimeMillis();
        array = removeElement(array, 2);
        System.out.println(System.currentTimeMillis() - time + " - delete third element in array!");




        // Deque.
        long timeCreateDeque = System.currentTimeMillis();
        Deque<Integer> testDeque = new ArrayDeque<>();
        fillDeque(testDeque, count);
        System.out.println(System.currentTimeMillis() - timeCreateDeque + " - create and fill deque!");



        System.out.println(testDeque.size() + " - size Deque");
//        long timeMyMehtodPring = System.currentTimeMillis();
//        printDeque(testDeque);
//        System.out.println();
//        System.out.println(System.currentTimeMillis() - timeMyMehtodPring + " - my print test");
//
//        testDeque.remove(1);
//        long timeTestPrint = System.currentTimeMillis();
//        System.out.println(testDeque);
//        System.out.println(System.currentTimeMillis() - timeTestPrint + " - print test");

        System.out.println();

        long testDelete = System.currentTimeMillis();
        testDeque.removeFirstOccurrence(2);
        System.out.println(System.currentTimeMillis() - testDelete + " - Delete element 2 not index");



        System.out.println();






    }




    // List
    static void fillDeque(Deque<Integer> list, int count) {


        for (int i = 0; i < count; i++) {
            list.addLast(new Random().nextInt(0, 10));
        }
    }

    static void printDeque(Deque<Integer> list) {
        for (int item : list) {
            System.out.print(item + " ");
        }
    }











    // Array
    static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(0, 10);
        }
    }

    static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

    static int[] removeElement(int[] array, int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        int[] newArr = new int[array.length - 1];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }
}
