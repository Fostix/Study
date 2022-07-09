package Lesson03.Ex004.V4;

import java.util.Iterator;
import java.util.List;

public abstract class Content implements Iterable<Content>{

    public List<Content> files;
    int index;
    public String name;

    public Content(String name) {
        this.name = name;
        index = 0;
    }




}
