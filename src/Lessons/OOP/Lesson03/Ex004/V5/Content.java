package Lessons.OOP.Lesson03.Ex004.V5;

import java.util.Iterator;

public abstract class Content implements Iterable<Content>{
    public String name;

    public Content(String name) {
        this.name = name;
        //this.index = 0;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Iterator<Content> iterator() {
        return null;
    }
}
