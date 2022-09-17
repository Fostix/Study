package Lessons.lesson4.Ex010;

import java.util.Random;

public class Teams {
    public static void main(String[] args) {
        int teamCount = 10; // Количество персонажей.
        Random rand = new Random();
        int magicianCount = rand.nextInt(0, teamCount); // Генерация магов.
        int priestCount = teamCount - magicianCount; // Регулирование.

        System.out.printf("magicalCount: %d priestCount: %d \n", magicianCount, priestCount);

        Priest[] priests = new Priest[priestCount]; // Массив пристов.
        Magician[] magicians = new Magician[magicianCount]; // Отдельный массив магов.

        for (int i = 0; i < priestCount; i++) { // Наполнение массива.
            priests[i] = new Priest();
            System.out.println(priests[i].getInfo());
        }
        System.out.println();

        for (int i = 0; i < magicianCount; i++) {
            magicians[i] = new Magician();
            System.out.println(magicians[i].getInfo());
        }
    }
}
