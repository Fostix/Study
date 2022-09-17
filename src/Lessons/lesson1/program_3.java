package Lessons.lesson1;

public class program_3 {
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a);
        var d = 123.456;
        System.out.println(d);
        System.out.println(getType(a));
        System.out.println(getType(d));
        d = 1022;
        System.out.println(d);
        //d = "mistake";
        //error: incompatible types:
        //String cannot be converted to double
    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
