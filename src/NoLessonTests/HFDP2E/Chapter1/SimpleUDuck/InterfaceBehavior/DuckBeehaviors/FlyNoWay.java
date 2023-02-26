package NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.InterfaceBehavior.DuckBeehaviors;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        // to do nothing
        System.out.println(" I can't fly");
    }
}
