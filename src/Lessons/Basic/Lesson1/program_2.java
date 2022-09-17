package Lessons.Basic.Lesson1;

public class program_2 {
    public static void main(String[] args) {
        short age = 10;
        int salary = 123456;
        System.out.println(age);
        System.out.println(salary);

        //---------------------------------
        //float f = 123.2; // without will not be work!!!
        float e = 2.7f;

        double pi = 3.1415; // this example work!!!
        double piT = 3.1415D;

        System.out.println(e);
        System.out.println(pi);


        char ch = '{';// char ch = 123; неявное преобразование в другой тип данных останется {.
        System.out.println(ch);

        int a = 12;
        double d = a; // помещается но наоборот a = d; нет понадобится преобразование.


        // ---------------------------------------
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); //true
        boolean flag3 = flag1 ^ flag2;  // разделительная дизъюнкция
        System.out.println(flag3); // false

        boolean f = true | false;
        System.out.println(f);




        // ------------------------------------------------
        String msg = "Hello world";

        System.out.println(msg);


        var i = 123;  // don't work why???

    }
}
