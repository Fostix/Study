package Lessons.Alrorythms.L2;

public class ExLSearch {
    public static void main(String[] args) {
        int[] array = new int[] {
                1, 2, 3, 4, 5, 6, 8, 9, 0
        };

        System.out.println(binarySearch(array, 9));
    }

    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value) {
        return binarySearch(array, value, 0, array.length - 1);
    }

    public static int binarySearch(int[] array, int value, int min, int max) {
        int midpoint;
        if (max < min)
            return -1;
        else
            midpoint = (max - min) / 2 + min;
        if (array[midpoint] < value) {
            return binarySearch(array, value, midpoint + 1, max);
        } else
            if (array[midpoint] > value)
                return binarySearch(array, value, min, midpoint - 1);
            else
                return midpoint;
    }
}
