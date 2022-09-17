package Lessons.LessonExceptions.Lesson2;

public class ClassCastException {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Dog dog = (Dog) animal;
    }
}
abstract class Animal {
}

class Cat extends Animal {

}

class Dog extends Animal {

}
