package Lesson00.Ex011Polymorphism;


import java.util.Random;

public abstract class BaseHero {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() {
        this(String.format("Hero_Priest #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200));
    }

    public String getInfo() {
        return String.format("Name: %s Hp: %d Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    private void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    private void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        else{ die(); }
    }

    public abstract void die();

    public void HealHero(BaseHero target) {
        int heal = BaseHero.r.nextInt(5, 15);
        target.healed(heal);
    }

    public void Attack(BaseHero target) { // Метод атаки был в контексте конкретного класса
        int damage = BaseHero.r.nextInt(10, 20);
        target.GetDamage(damage);
    }

}
