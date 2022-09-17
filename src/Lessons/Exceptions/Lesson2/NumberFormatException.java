package Lessons.Exceptions.Lesson2;

public class NumberFormatException {
    public static void main(String[] args) {
        String number = "123q";
        int result = Integer.parseInt(number);
        System.out.println(result);
    }
}
