package NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.InterfaceBehavior.DuckBeehaviors;

public class Squack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("duckie squack");
    }
}
