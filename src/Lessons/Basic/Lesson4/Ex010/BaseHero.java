package Lessons.Basic.Lesson4.Ex010;

import java.util.Random;

public class BaseHero { // Основаная логика.
    protected static int number;
    protected static Random r;

    protected  String name; // В рамках текущего класса и всех наследуемых.
    protected int hp;
    protected int maxHp;

    static { // Инициализатор статических полей.
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(String name, int hp) { // Конструктор отвечает за инициализацию имени и хп.
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() { // Конструктор по умолчанию.
        this(String.format("Hero_Priest #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200));
    }

    public String getInfo() { // Метод.
        return String.format("Name: %s Hp: %d Type: %s",
        this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed(int Hp) { // Метод.
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) { // Метод.
        if(this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

}
