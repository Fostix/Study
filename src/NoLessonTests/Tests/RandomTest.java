package NoLessonTests.Tests;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        String s = String.valueOf(new Random().nextInt(10));
        System.out.println(new Random().nextInt(10));
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(10));
        }
    }
}
