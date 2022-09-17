package Lessons.OOP.Lesson01.Ex007.v1;

import Lesson01.Ex007.v1.Healers.Druid;
import Lesson01.Ex007.v1.Healers.Healer;
import Lesson01.Ex007.v1.Healers.Shaman;
import Lesson01.Ex007.v1.Warriors.Knight;
import Lesson01.Ex007.v1.Warriors.Paladin;
import Lesson01.Ex007.v1.Warriors.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        //#region team1
        List<Hero> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Shaman());
        team1.add(new Paladin());
        team1.add(new Druid());

        // team1.get(0).attack

        var h = team1.get(0);

        if (h instanceof Warrior) { // Проверка является ли h типом Healer или принадлежит такому типу!!!
            ((Warrior) h).attack(null); // Каст к типу войну.
            // h.attack(null); // Нельзя h наполняется базовыми классами Hero.
        }
        else if (h instanceof Healer) { // Проверка является ли h типом Healer или принадлежит такому типу!!!
            ((Healer) h).healing(null); // Каст к типу хиллер.
        } else {
            //....
        }
        //#endregion

        //#region team2
        List<Warrior> team2 = new ArrayList<>(); // Можно так, но теперь можно наполнять только наследников в контексте иерархии (Войнами)!!
        //team2.add(new Druid()); // На одном уровне иерархии!! Нельзя!!
        team2.add(new Paladin());
        team2.add(new Knight());

        team2.get(0).attack(null); // Теперь не нужно проверять, потому что точно известно.
        // У всех войнов есть метод атаки.
        // Без проверки if h instanceof Warrior код работает быстрее и всё проще!!

        List<Healer> team3 = new ArrayList<>(); // Точно так же. Никакой войн сюда попасть уже не сможет.
        //team2.add(new Paladin());
        team3.add(new Druid());
        team3.add(new Shaman());

        team3.get(0).healing(null);


        //#endregion



    }
}
