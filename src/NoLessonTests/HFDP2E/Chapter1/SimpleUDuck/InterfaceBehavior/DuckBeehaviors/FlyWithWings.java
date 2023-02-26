package NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.InterfaceBehavior.DuckBeehaviors;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
