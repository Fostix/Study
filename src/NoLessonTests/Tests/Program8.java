package NoLessonTests.Tests;

public class Program8 {
    public static void main(String[] args) {
        String string = "hello";
        StringBuilder bilder = new StringBuilder("hello");
        StringBuilder bilder2 = new StringBuilder("hello");

        //System.out.println(string==bilder);
        System.out.println(string.equals(bilder));
        System.out.println(bilder.equals(bilder2));
    }
}
