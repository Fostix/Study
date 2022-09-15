package Lesson02.Ex003.ExBeverage;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage implements Iterable<Ingredient> {
    public List<Ingredient> components;
    int index;

    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component) { // method add
        components.add(component);
    }

//    @Overriffde
//    public boolean hasNext() { // реализация методов итератора.
//        return index < components.size();
//    }
//
//    @Override
//    public Ingredient next() {
//        return components.get(index++);
//    }
}
