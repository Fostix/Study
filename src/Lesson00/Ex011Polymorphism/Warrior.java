package Lesson00.Ex011Polymorphism;

public class Warrior extends BaseHero {
    private int fury;
    private int maxFury;

    public Warrior() {
        super(String.format("Hero_Warrior #%d", ++Warrior.number),
                Warrior.r.nextInt(100, 200));
        this.maxFury = Warrior.r.nextInt(50, 150);
        this.fury = maxFury;
    }

    public String getInfo() {
        return String.format("%s Fury %d", super.getInfo(), this.fury);
    }

    @Override
    public void die() {
        System.out.println("Remember meee AAAAA!!");
    }
}
