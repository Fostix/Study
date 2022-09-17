package Lessons.OOP.Lesson01.Ex000Counter;

public class Foo {
    public Integer value;

    public static Integer count;
    // public static Integer count = 0; // неправильная инициализация

    static { // Правильная инициализация статистического поля.
        count = 0;
    }

    public Foo() { // Конструктор.
        count++;
    }

    public int printCount() {
        // System.out.println(count);
        return count;
    }



    @Override
    public String toString() {
        return value.toString();
    }
}
