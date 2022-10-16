package NoLessonTests.Algorithms.Sorts;

public class PrintArray {
    void printArray(int array[]) {
        int length = array.length;
        for (int value : array) {
            System.out.printf("%d ", value);
        }
        System.out.println();
    }
}
