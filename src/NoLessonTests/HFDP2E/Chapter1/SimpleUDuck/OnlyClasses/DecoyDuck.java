package NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.OnlyClasses;

public class DecoyDuck extends Duck{
    @Override
    public void quack() {
        // to do nothing
    }

    @Override
    void fly() {
        // to do nothing
    }

    @Override
    void display() {
        System.out.println("decoy duck");
    }
}
