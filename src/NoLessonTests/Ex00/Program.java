package NoLessonTests.Ex00;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        // new Human(new Cat()).call();
        new Human(new Cat(), new Dog(), new Dog()).call();
    }
}

abstract class Animal { // abstract для того то бы невозможно было создать животное типа животное
    abstract public void voice();

}

class Cat extends Animal{
    String name;

    void meow() {
        System.out.println("meow");
    }

    @Override
    public void voice() {
        meow();
    }
}

class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("guw guw");
    }
}
class Human {
    // Animal animal;
    ArrayList<Animal> animals = new ArrayList<>();
    public Human(Animal ... c) {
        for (Animal animal : c) {
            animals.add(animal);
        }
        // animals = c;
    }

    void call() {
        System.out.println("-----");
        // animals.voice();
        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
