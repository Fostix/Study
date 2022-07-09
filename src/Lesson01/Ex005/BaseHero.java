package Lesson01.Ex005;

public abstract class BaseHero {

    public BaseHero(String name, int hp) {
        System.out.println("Вызван BaseHero(String name, int hp)");
    }

    public BaseHero() {
        this("", 0); // Производит вызов конструктора с двумя аргументами.
        System.out.println("Вызван BaseHero()");
    }
}