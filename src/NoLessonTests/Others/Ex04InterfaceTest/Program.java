package NoLessonTests.Others.Ex04InterfaceTest;

public class Program {
    public static void main(String[] args) {
        IInterface test = new TestHello();
        test.hello();
        test.hello();
    }
}
