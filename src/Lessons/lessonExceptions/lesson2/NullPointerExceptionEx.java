package Lessons.lessonExceptions.lesson2;

public class NullPointerExceptionEx extends Throwable {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());
    }
}
