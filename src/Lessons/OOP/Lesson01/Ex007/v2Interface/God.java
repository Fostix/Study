package Lessons.OOP.Lesson01.Ex007.v2Interface;

import Lesson01.Ex007.v2Interface.Healers.Healer;
import Lesson01.Ex007.v2Interface.Warriors.Warrior;

public class God extends Hero implements Healer, Warrior { // Класс герой, но одновременно Лекарь и Воин!!

    @Override
    public void attack(Hero target) {
        
    }

    @Override
    public void healing(Hero target) {
        
    }
}

