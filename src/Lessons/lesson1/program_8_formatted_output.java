package Lessons.lesson1;

public class program_8_formatted_output {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);

        String s = "qwe";
        int a1 = 123;
        String q = s + a1;  // 4 строки
        System.out.println(q);


        int a2 = 1, b2 = 2;
        int c2 = a2 + b2;
        String res2 = a2 + " + " + b2 + " = " + c2;
        System.out.println(res2);


//        %d: целочисленных значений
//        %x: для вывода шестнадцатеричных чисел
//        %f: для вывода чисел с плавающей точкой
//        %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
//        %c: для вывода одиночного символа
//        %s: для вывода строковых значений


        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00



    }
}
