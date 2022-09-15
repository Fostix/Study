package Lesson01.Ex000Counter;

public class Program {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.value=123;
        System.out.println(f1.value + " f1 value");
        // System.out.println(f1); // work too

        f1.printCount();

        Foo.count=123000;

        Foo f2 = new Foo();
        f2.value=222;
        System.out.println(f2.value + " f2 value");
        // System.out.println(f2);
        f2.printCount();
        System.out.println(f2.printCount());
        Foo f3 = new Foo();
        f3.value=333;
        System.out.println(f3.value + " f3 value");
        // System.out.println(f3);
        f3.printCount();

        int count = f3.printCount();
        System.out.println(count);
    }
}
