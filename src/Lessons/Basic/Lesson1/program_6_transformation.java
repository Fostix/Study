package Lessons.Basic.Lesson1;

public class program_6_transformation {
    public static void main(String[] args) {
        int i = 123; double d = i;
        System.out.println(i); // 123
        System.out.println(d); // 123.0
        d = 3.1415; i = (int)d;
        System.out.println(d); // 3.1415
        System.out.println(i); // 3
        d = 3.9415; i = (int)d;
        System.out.println(d); // 3.9415
        System.out.println(i); // 3
        byte b = Byte.parseByte("123");
        System.out.println(b); // 123
        // b = Byte.parseByte("1234"); // byte length from 0 to 255.
        // System.out.println(b); // NumberFormatException: Value out of range

        // int[] a1 = new int[10];
        // double[] d1 = a1; // ИЗУЧАЕМ ковариантность и контравариантность



    }
}
