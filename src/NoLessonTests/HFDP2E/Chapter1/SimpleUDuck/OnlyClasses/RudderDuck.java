package NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.OnlyClasses;

public class RudderDuck extends Duck{
    @Override
    public void quack() {
        System.out.println("change");
    }

    @Override
    void fly() {
        // to do nothing
    }

    @Override
    void display() {

    }
}
