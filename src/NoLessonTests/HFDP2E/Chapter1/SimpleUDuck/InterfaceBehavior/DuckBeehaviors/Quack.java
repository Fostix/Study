package NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.InterfaceBehavior.DuckBeehaviors;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("duck quacking");
    }
}
