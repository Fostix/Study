package Lessons.OOP.Lesson03.Ex006_Game.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    public List<Programmer> programmers;

    public Team(String name) {
        this.name = name;
        programmers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(Programmer p) {
        programmers.add(p);
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, programmers);
    }
}
