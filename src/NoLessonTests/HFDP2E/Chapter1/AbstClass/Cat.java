package NoLessonTests.HFDP2E.Chapter1.AbstClass;

public class Cat extends Animal{
    @Override
    void makeSound() {
        meow();
    }

    void meow() {
        System.out.println("meow");
    }
}
