package NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.InterfaceBehavior.DuckBeehaviors;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        // do to nothing - can't quack!
        System.out.println("<< Silence >>");
    }
}
