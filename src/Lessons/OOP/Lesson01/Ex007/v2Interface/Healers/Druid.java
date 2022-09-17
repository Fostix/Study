package Lessons.OOP.Lesson01.Ex007.v2Interface.Healers;

import Lesson01.Ex007.v2Interface.Hero;

public class Druid extends Hero implements Healer { // Друид наследник героя,
    // но при этом имплементирует (реализовывать) интерфейс хилер.

    @Override
    public void healing(Hero target) {
 
    }
}
