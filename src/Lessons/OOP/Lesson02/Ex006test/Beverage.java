package Lessons.OOP.Lesson02.Ex006test;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage<I extends Ingredient> implements Iterable<I>{

    public List<I> components;
    int index;

    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(I component) {
        if(!(components.indexOf(component) != -1))
            components.add(component);
    }

}
