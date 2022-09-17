package Lessons.lesson3;

public class Ex03_array {
    public static void main(String[] args) {
        int[] a = new int[] {1, 9};
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);

        for (int i : a) { System.out.printf("%d ", i); }
        System.out.println();
        for (int j : b) { System.out.printf("%d ", j); }
    }
}
