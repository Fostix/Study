package NoLessonTests.HFDP2E.Chapter1.SimpleUDuck.OnlyClasses;

public abstract class Duck {
    public void quack() {
        System.out.println("quack");
    }

    void swim() {
        System.out.println("swim");
    }

    void fly() { // new
        System.out.println("fly");
    }

    abstract void display();
}
