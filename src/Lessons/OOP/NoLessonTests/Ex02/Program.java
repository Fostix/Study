package Lessons.OOP.NoLessonTests.Ex02;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        // new Human(new Cat()).call();
        new Human(new Cat(new NewMeow()), new Cat(new Meow(new FileTerminal())), new Dog(), new Dog()).call();
    }
}

abstract class Animal { // abstract для того то бы невозможно было создать животное типа животное
    abstract public void voice();
}

interface Voice {
    void voice();
}

interface View {
    void PrintLn(String f);
}


class Terminal implements View {
    @Override
    public void PrintLn(String f) {
        System.out.println(f);
    }
}
class FileTerminal implements View {
    @Override
    public void PrintLn(String f) {
        System.out.println(f);
    }
}

class Meow implements Voice {
    View v;
    public Meow(View v) {
        this.v = v;
    }
    @Override
    public void voice() {
        v.PrintLn("meow");
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
