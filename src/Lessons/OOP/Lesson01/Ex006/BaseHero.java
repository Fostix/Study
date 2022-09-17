package Lessons.OOP.Lesson01.Ex006;

public abstract class BaseHero {

    int hp;
    public BaseHero(String name, int hp) {
        System.out.println("Вызван BaseHero(String name, int hp)");
        this.hp = hp;
    }

    public BaseHero() {
        this("", 0); // Производит вызов конструктора с двумя аргументами.
        System.out.println("Вызван BaseHero()");
    }
}