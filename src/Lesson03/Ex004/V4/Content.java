package Lesson03.Ex004.V4;



public abstract class Content implements Iterable<Content>{

    public String name;


    public Content(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


}
