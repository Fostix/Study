package Lesson03.Ex004.V5;

import java.util.Iterator;

public abstract class Content{
    public String name;





    public Content(String name) {
        this.name = name;
        //this.index = 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
