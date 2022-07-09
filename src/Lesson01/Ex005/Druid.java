package Lesson01.Ex005;

public class Druid extends BaseHero {

    public Druid(String name, int hp) { // Конструктор с двумя аргументами
        super(name, hp);
        System.out.println("Вызван Druid(String name, int hp)");

    }

    public Druid() { // Конструктор по умолчанию
        this("", 0);
        // super("", 0);
        System.out.println("Вызван Druid()");
    }
}