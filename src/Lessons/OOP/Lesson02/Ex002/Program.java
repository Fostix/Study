package Lessons.OOP.Lesson02.Ex002;


import Lesson02.Ex002.ExBeverage.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //#region Intro Iterator
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        //#endregion

        //#region Worker Iterator
        Worker worker = new Worker("Иванов", "Батут", 1, 99999999);

        Iterator<String> components = worker; // Приведён к типу итератор

        while (components.hasNext()) {
            System.out.println(worker.next());
        }
        //#endregion

        //#region Beverage Iterator

        Beverage latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Зёрна"));
        latte.addComponent(new Milk("Молоко"));

        Iterator<Ingredient> iterator = latte;

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        for (Ingredient string : latte ) { // don't work watch next example.
//            System.out.println(string);
//        }

        //#endregion

    }
}
