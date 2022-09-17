package Lessons.Exceptions.Lesson3;

public class TestExceptionChecked extends Exception{
    private  TestExceptionChecked(String message, Exception e) {
        super(message, e);
    }
}