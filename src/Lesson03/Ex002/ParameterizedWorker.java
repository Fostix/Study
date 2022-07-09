package Lesson03.Ex002;

public class ParameterizedWorker<E> { // E Наперёд неизвестный тип!! (place holder)
    private E id;

    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public ParameterizedWorker(E id, String firstName, String lastName, int age, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
}
