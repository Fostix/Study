package NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.AddInterfaces;

import NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.AddInterfaces.Interfaces.Quackable;

public class DecoyDuck extends Duck implements Quackable {
    @Override
    void display() {
        System.out.println("decoy duck");
    }

    @Override
    public void quack() {
        System.out.println("decoy quack");
    }
}
