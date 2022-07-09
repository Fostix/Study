package Lesson01.Ex006;

public class Druid extends BaseHero {

    int mp;
    public Druid(String name, int hp, int mp) { // Конструктор с двумя аргументами
        super(name, hp);
        System.out.println("Вызван Druid(String name, int hp)");
        this.mp = mp;
        // this.hp = (int)(this.hp *0.8); // реинициализация текущего экземпляра.
    }

    public Druid() { // Конструктор по умолчанию
        this("", 0, 0);
        // super("", 0);
        System.out.println("Вызван Druid()");
    }
}