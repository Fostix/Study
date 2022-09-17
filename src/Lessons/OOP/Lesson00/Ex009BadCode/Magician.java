package Lessons.OOP.Lesson00.Ex009BadCode;

import java.util.Random;

public class Magician {
    private static int number;
    private static Random r;


    private String name; // Состояние.
    private int hp; // Состояние.
    private int maxHp; // Состояние.

    private int mana; // Состояние.
    private int maxMana; // Состояние.

    static  {
        Magician.number = 0;
        Magician.r = new Random();
    }

    public Magician(String name, int hp, int mana) { // Конструктор.
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.mana = mana;
        this.maxMana = mana;
    }

    public Magician() { // Еще конструктор по умолчанию.
        this(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200),
                Magician.r.nextInt(50, 150));
    }

    public int Attack() { // Метод.
        int damage = Magician.r.nextInt(20,30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() { // Метод.
        return String.format("Name: %s Hp: %d Enegry: %d Type: %s",
                this.name, this.hp, this.mana, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) { // Метод.
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
}
