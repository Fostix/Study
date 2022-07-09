package Lesson01.Ex001Static;


class Doo extends Foo {
    public void M() {
        Foo.count = 123;
    }
}

public class Foo {
    public Integer value;

    protected static Integer count; // provate.

    public static Integer getCount() {
        return count;
    }


    static { // Правильная инициализация статистического поля.
        count = 0;
    }

    public Foo() { // Конструктор.
        count++;
    }

    public void printCount() {
        System.out.println(count);
    }



    @Override
    public String toString() {
        return value.toString();
    }
}
