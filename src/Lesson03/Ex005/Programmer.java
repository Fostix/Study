package Lesson03.Ex005;

import java.util.Random;
import java.util.UUID;

public abstract class Programmer {
    private String fullName;
    private int age;

    public Programmer() {
        Random r = new Random();
        String tName = UUID.randomUUID().toString().substring(0);
        int tAge = r.nextInt(18, 55);
        this.fullName = String.format("Name_%s", tName);
        this.age = tAge;
    }


    @Override
    public String toString() {
        String sn = this.getClass().getSimpleName();
        return String.format("[%s %d >%s]", fullName, age, sn);
    }
}
