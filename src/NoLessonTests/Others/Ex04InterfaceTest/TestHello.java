package NoLessonTests.Others.Ex04InterfaceTest;

public class TestHello implements IInterface{
    @Override
    public void hello() {
        System.out.println("Hello");
    }

    public void privet() {
        System.out.println("Privet");
    }
}
