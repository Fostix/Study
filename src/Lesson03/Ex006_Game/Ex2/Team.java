package Lesson03.Ex006_Game.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Team<T> {
    private String name;
    private List<T> programmers;

    public Team(String name){
        this.name = name;
        programmers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(T p) {
        programmers.add(p);
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, programmers);
    }
}
