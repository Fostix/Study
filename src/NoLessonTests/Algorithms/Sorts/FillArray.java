package NoLessonTests.Algorithms.Sorts;

import java.util.Random;

public class FillArray {
    public void fillArray(int array[]) {
        int length = array.length;
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
