package Lessons.OOP.Lesson03.Ex005;

import java.util.Random;

public class Ex003_GenericMethod {
    public static void main(String[] args) {
        System.out.println(GenericMethod.<String>Swap("str1", "str2"));
        System.out.println(GenericMethod.Swap(100, 200));
        System.out.println(GenericMethod.Swap(true, false));
        System.out.println(GenericMethod.Swap(false, true));
    }
}

class GenericMethod {
    static Random random = new Random();

    public static <T> T Swap(T arg1, T arg2) {
        int t = random.nextInt(2);
        return t == 0 ? arg1 : arg2;
        // var res = arg1 + arg2;
    }
 }
