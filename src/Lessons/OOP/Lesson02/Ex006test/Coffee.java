package Lessons.OOP.Lesson02.Ex006test;

import java.util.Iterator;

public class Coffee<I extends Ingredient> extends Beverage {

    @Override
    public Iterator<I> iterator() {
        Iterator<I> it = new Iterator<I>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public I next() {
                return (I) components.get(index++);
            }
        };

        return it;
    }
}
