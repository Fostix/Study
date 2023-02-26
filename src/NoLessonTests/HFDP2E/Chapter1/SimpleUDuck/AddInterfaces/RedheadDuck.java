package NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.AddInterfaces;

import NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.AddInterfaces.Interfaces.Flyable;
import NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.AddInterfaces.Interfaces.Quackable;

public class RedheadDuck extends Duck implements Quackable, Flyable {
    @Override
    void display() {
        System.out.println("redhead duck");
    }

    @Override
    public void quack() {
        System.out.println("redhead quack");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
