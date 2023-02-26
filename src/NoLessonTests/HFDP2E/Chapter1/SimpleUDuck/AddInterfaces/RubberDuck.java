package NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.AddInterfaces;

import NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.AddInterfaces.Interfaces.Quackable;

public class RubberDuck extends Duck implements Quackable {
    @Override
    void display() {
        System.out.println("rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("rubber quack");
    }
}
