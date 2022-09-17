package Lessons.LessonExceptions.Lesson1;

public class Divide {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
        System.out.println(divide(-10, 10));
        System.out.println(divide(10, 0));
    }
    public static int divide(int a1, int a2) {
//        if (a2 == 0) {
//            return -1;
//        }
        return a1 / a2;
    }
}
