package Lessons.OOP.NoLessonTests.Tests;

public class SwitchCaseTest {
    public static void main(String[] args) {
        float a = 23.4F;
        switch ((int) a) {
            case (int) 23.43F:
                System.out.println("a");
            case (int) 12.4F:
                System.out.println("b");
        }
        System.out.println(Short.SIZE); // вот так-то не 8

        String java = "java";
        System.out.println(java.toUpperCase());
        System.out.println(java.toUpperCase());
        StringBuilder d = new StringBuilder("Не нужно импортировать библеотечку для StringBuffer и ... ");
    }
}
