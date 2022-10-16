package NoLessonTests.Others.Ex01;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        // new Human(new Cat()).call();
        new Human(new Cat(new NewMeow()), new Cat(new Meow()), new Dog(), new Dog()).call();
    }
}

abstract class Animal {
    abstract public void voice();
}

interface Voice {
    void voice();
}

class Meow implements Voice {
    @Override
    public void voice() {
        System.out.println("meow");
    }
}

class NewMeow implements Voice {
    @Override
    public void voice() {
        System.out.println("new meow");
    }
}

class Cat extends Animal{
    String name;
    Voice v;


    void meow() {
        v.voice();
    }

    public Cat(Voice v) {
        this.v = v;
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
