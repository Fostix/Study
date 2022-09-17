package Lessons.lesson4.Ex010;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician(); // Создание персонажа.
        System.out.println(hero1.getInfo());

        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());

        hero3.GetDamage(hero2.Attack());
        hero3.GetDamage(hero3.Attack()); // Персонаж сам себя бьёт.
        System.out.println(hero3.getInfo());
        System.out.println(hero2.getInfo());
    }

}
