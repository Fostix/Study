package Lesson02.Ex003.ExBeverage;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {  // переопределение метода или перегрузка метода!!
        return brand;
    }
}