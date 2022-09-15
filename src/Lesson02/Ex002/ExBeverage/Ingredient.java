package Lesson02.Ex002.ExBeverage;

public class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {  // переопределение метода или перегрузка метода!!
        return brand;
    }
}
