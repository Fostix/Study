package Lesson03.Ex004.V4;


import java.util.Iterator;

public class VideoContent extends Content {
    public VideoContent(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public Iterator<Content> iterator() {
        Iterator<Content> iter = new Iterator<Content>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < files.size();
            }

            @Override
            public Content next() {
                return files.get(index++);
            }
        };

        return iter;
    }

}
