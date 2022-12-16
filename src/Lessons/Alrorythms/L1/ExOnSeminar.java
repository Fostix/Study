package Lessons.Alrorythms.L1;

import java.util.Date;

public class ExOnSeminar {
    private static long fibonacciCache[];

    public static void main(String[] args) {

        int n = 40;

        for (int i = 0; i < 10; i++) {
            Date a = new Date();

            fibonacciCache = new long[n + 1];
            fibonacciCacheCall(n);

            Date b = new Date();
            long workTime = b.getTime() - a.getTime();
            System.out.println(workTime);
        }
    }

    public static void fibonacciRecCall(int n) {
        for (int i = 0; i <= n; i++) {
            fibonacciRec(i);
//            System.out.println(fibonacciRec(i));
        }
    }

    public static long fibonacciRec(int n) {
        if (n <= 1)
            return n;
        return (fibonacciRec(n - 1) + fibonacciRec(n - 2));
    }



    public static void fibonacciCacheCall(int n) {
        for (int i = 0; i <= n; i++) {
            fibonacciCache(i);
            //System.out.println(fibonacciCache(i));
        }
    }

    public static long fibonacciCache(int n) {
        if (n <= 1)
            return n;

        if (fibonacciCache[n] != 0)
            return fibonacciCache[n];

        long nthFibonacciNumber = (fibonacciCache(n - 1) + fibonacciCache(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }


    public static long fibonacciCacheIn(int n) {
        if (n <= 1)
            return n;
        else {
            final long[] array = new long[n];
            array[0] = 1;
            array[1] = 1;
            for (int i = 2; i < array.length; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            return array[n - 1];
        }
    }
}
