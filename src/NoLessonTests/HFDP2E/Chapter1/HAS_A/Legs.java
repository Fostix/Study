package NoLessonTests.HFDP2E.Chapter1.HAS_A;

public class Legs {
    public String howManyLegs() {
        return "I have four legs";
    }
}

class Dog {
    Legs legs = new Legs();

    public void aboutMe() {
        System.out.println("I am a Dog class and " + legs.howManyLegs());
    }
}
