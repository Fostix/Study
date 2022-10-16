package NoLessonTests.Algorithms.Sorts;

public class SelectionSort {

    void sort(int array[]) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int min_index = i;
            for (int j = i+1; j < length; j++)
                if (array[j] < array[min_index])
                    min_index = j;

            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }
}
