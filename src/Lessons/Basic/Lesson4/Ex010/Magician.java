package Lessons.Basic.Lesson4.Ex010;

public class Magician extends BaseHero{ // Magician производный класс от BaseHero

    private int mana;
    private int maxMana;

    public Magician() {
        // this.name = "sdf"; // Неправильно наследованное поле.
        // super.name = "sdf"; // Так правильно.
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200)); // Переиспользование конструктора базового класса.
        this.maxMana = Magician.r.nextInt(50, 150); // Доинициализация.
        this.mana = maxMana;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if(mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    } // Добавление получения информации о количестве маны.

}
