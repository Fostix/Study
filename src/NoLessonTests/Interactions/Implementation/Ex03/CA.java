package NoLessonTests.Interactions.Implementation.Ex03;

public class CA implements A{
    @Override
    public void firstMethod() {
        B cb = new CB();
        cb.secondMethod();
    }
}
