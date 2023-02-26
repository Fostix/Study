package NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.InterfaceBehavior;

import NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.InterfaceBehavior.DuckBeehaviors.FlyNoWay;
import NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.InterfaceBehavior.DuckBeehaviors.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
