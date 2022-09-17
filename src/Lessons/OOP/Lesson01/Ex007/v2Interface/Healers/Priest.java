package Lessons.OOP.Lesson01.Ex007.v2Interface.Healers;

import Lessons.OOP.Lesson01.Ex007.v2Interface.Hero;

public class Priest extends Hero implements Healer { // Прист наследник героя,
    // но при этом имплементирует (реализовывать) интерфейс хилер.

    @Override
    public void healing(Hero target) { // Логика лечения.
        
    }
    
}
