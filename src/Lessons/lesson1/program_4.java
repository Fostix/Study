package Lessons.lesson1;

public class program_4 {
    public static void main(String[] args) {
        int number = 123_123_123;
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        String s = "qwerty";
        // s[1] error

        System.out.println(s.charAt(1));

        // # Операции

        // Приоритеты инкремента.
        int a = 123;
        System.out.println(a++); // Postfix increment.
        System.out.println(a);
        System.out.println(++a); // Prefix increment.


        int b = 123;
        b = b-- - --b;
        System.out.println(b);

        int c = 123;
        c = --c - c--;
        System.out.println(c);

        boolean f = 13 > 23;
        System.out.println(f);

//        Присваивание: =
//        Арифметические: *, /, +, -, %, ++, --
//        Операции сравнения: <, >, ==, !=, >=, <=
//        Логические операции: ||, &&, ^, !
//        Побитовые операции <<, >>, &, |, ^

        int l = 8;
        // 1000
        int o = 8;
        System.out.println(l << 2);
        System.out.println(o >> 1);

        System.out.println("----------------------------------------");
        int q = 5;
        int r = 2;
        System.out.println(q | r);
        // 101
        // 010
        // 111

        int t = 5;
        int y = 2;
        System.out.println(t & y);
        // 101
        // 010
        // 000


        int u = 5;
        int p = 5;
        System.out.println(u & p);
        // 101
        // 010
        // 111

        boolean g = true;
        boolean j = true;
        System.out.println(g & j);
        System.out.println(g && j);


        String s1 = "qwer";
        boolean b1 = s1.length() >= 5 && s1.charAt(4) == '1';
        // boolean b2 = s1.length() >= 5 & s1.charAt(4) == '1';

        System.out.println(b1);
        // System.out.println(b2); error

    }
}