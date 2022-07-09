package Lesson01.Ex000Counter;

public class Foo {
    public Integer value;

    public static Integer count;

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
