package NoLessonTests.Tests;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int e = new int[4][8].length;
        System.out.println(e);
        boolean a;
        boolean b;
        Scanner s = new Scanner(System.in);
        do {
            a = s.nextBoolean();
            System.out.println(a);
            b = s.nextBoolean();
            System.out.println(b);
        } while (a ^ b);
        System.out.println(a + "\n" + b);
    }
}
