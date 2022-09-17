package NoLessonTests.Tests;

public class Program2 {
    public static void main(String[] args) {
        Program2 a = new Program2();
        System.out.println(a.method());
    }
    boolean method() {
        return 'a' < 70; //(boolean) 0; this don't work!!
    }
}
