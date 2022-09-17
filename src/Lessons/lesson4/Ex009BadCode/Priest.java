package Lessons.lesson4.Ex009BadCode;

import java.util.Random;

public class Priest {
    private static final String HERO_PRIEST_D = "Hero_Priest #%d";
    private static int number;
    private static Random r;

    private String name; // Состояние.
    private int hp; // Состояние.
    private int maxHp; // Состояние.

    private int elixir; // Состояние.
    private int maxElixir; // Состояние.

    static {
        Priest.number = 0;
        Priest.r = new Random();
    }

    public Priest(String name, int hp,  int elixir) { // Конструктор.
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.elixir = elixir;
        this.maxElixir = elixir;
    }

    public Priest() { // Конструктор.
        this(String.format(HERO_PRIEST_D, ++Priest.number),
                Priest.r.nextInt(100, 200),
                Priest.r.nextInt(50, 150));
    }

    public int Attack() { // Метод.
        int damage = Priest.r.nextInt(20, 30);
        this.elixir -= (int)(damage * 0.8);
        if(elixir < 0) return 0;
        else return damage;
    }

    public String getInfo() { // Метод.
        return String.format("Name: %s Hp: %d Elixir: %d Type: %s",
                this.name, this.hp,  this.elixir, this.getClass().getSimpleName());
    }

    public void healer(int Hp) { // Метод.
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) { // Метод.
        if(this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
}
