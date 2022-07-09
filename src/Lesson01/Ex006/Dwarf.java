package Lesson01.Ex006;

public class Dwarf extends Druid {
    
    public Dwarf(String name, int hp) {
        super(); // Базовым классом для него будет уже Druid!
        System.out.println("Вызван Dwarf(String name, int hp)");
    }

    public Dwarf() {
        this("", 0);
        System.out.println("Вызван Dwarf()");
    }
   
}