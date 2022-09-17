package Lessons.OOP.Lesson01.Ex007.v2Interface.Warriors;

import Lesson01.Ex007.v2Interface.Hero;

public class Paladin extends Hero implements Warrior  { // Паладин наследник героя,
    // но при этом имплементирует (реализовывать) интерфейс Война.

    @Override
    public void attack(Hero target) {
        
    }
}
