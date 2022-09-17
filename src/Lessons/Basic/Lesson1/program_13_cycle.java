package Lessons.Basic.Lesson1;

public class program_13_cycle {
    public static void main(String[] args) {

        int value = 123;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
        System.out.println("-----------------------------------");

        int value1 = 321;
        int count1 = 0;
        do {
            value1 /= 10;
            count1++;
        } while (value1 != 0);
        System.out.println(count1);
        System.out.println("-----------------------------------");


        // Использование continue, break плохо!
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) continue;
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            //break;
            for (int j = 0; j < 5; j++) {
                break;
            }
            break;
        }

        System.out.println("-----------------------------------");
        // Глубина рекурсия??
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");


        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        for(int item : arr) {
            item = 13; // не измениться сам массив
            System.out.print(item + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int item : arr) {
            System.out.print(item + " ");
        }
    }
}
