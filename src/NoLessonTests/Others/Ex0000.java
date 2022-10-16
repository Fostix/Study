package NoLessonTests.Others;

public class Ex0000 {
    public static void main(String[] args) {
        int a = 1,
                b = 2,
                c = 3,
                d = 4,
                t;
        System.out.printf("%d %d %d %d\n", a, b, c, d);
        t = a;
        a = b;
        b = c;
        c = d;
        d = t;
        System.out.printf("%d %d %d %d\n", a, b, c, d);
    }
}
