package Lesson00.Ex011Polymorphism;

public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxMana = Magician.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public void die() {
        System.out.println("Hello I am die");
    }

    public String getInfo() {
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }
}
