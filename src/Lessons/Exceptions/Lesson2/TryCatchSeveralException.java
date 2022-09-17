package Lessons.Exceptions.Lesson2;

public class TryCatchSeveralException {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 1;
            String test = null;
            System.out.println(test.length());

        } catch (ArithmeticException e) {
            System.out.println("Operation divide by zero not supported");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
        System.out.println(number);
    }
}
