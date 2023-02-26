package NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.AddInterfaces;

import NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.AddInterfaces.Interfaces.Flyable;
import NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.AddInterfaces.Interfaces.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {

    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void quack() {
        System.out.println("mallard quack");
    }
}
