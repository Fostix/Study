package Lessons.OOP.Lesson00.Ex011Polymorphism;

public class Priest extends BaseHero{

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxElixir = Magician.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    public void die() {
        System.out.println("AAAA I am die");
    }

    public String getInfo() {
        return String.format("%s ElixirL %d", super.getInfo(), this.elixir);
    }
}
