package NoLessonTests.HFDP2E.Chapter1.IS_A;

public class Animal {
    public String whatAmI() {
        return "I belong to Animal class";
    }
}

class Dog extends Animal {
    public void aboutMe() {
        System.out.println("I am a Dog class and " + whatAmI());
    }
}