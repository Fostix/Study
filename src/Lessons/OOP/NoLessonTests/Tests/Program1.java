package Lessons.OOP.NoLessonTests.Tests;

public class Program1 {
    static void methodAA() {
        System.out.println("program1");
    }
}
class AA extends Program1{
    static void methodAA() {
        System.out.println("AA");
    }
}
class Doo {
    public static void main(String[] args) {
        AA.methodAA();
    }
}