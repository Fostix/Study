package NoLessonTests.HFDP2E.Chapter1.AbstClass;

public class Dog extends Animal{
    @Override
    void makeSound() {
        bark();
    }

    void bark() {
        System.out.println("bark");
    }
}
