package Lesson03.Ex004.V4;


import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class AudioContent extends Content implements Iterable<Content>{
    public List<Content> files;
    int index;
    public AudioContent(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name;
    }

}
