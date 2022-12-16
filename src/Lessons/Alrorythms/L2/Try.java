package Lessons.Alrorythms.L2;

import java.util.Random;

public class Try {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        fillArray(arr);
        showArray(arr);
        System.out.println(checkArr(arr));

    }

    public static boolean checkArr(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                flag = false;
        }
        return flag;
    }

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
    }

    public static void heapSort(int[] arr) {
        int i = arr.length / 2;
        int r = arr.length;
        if (i > 1) {
            i--;
            //r = r
        }
    }
}
