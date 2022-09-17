package Lessons.OOP.Lesson01.Ex001Static;

public class Program {
    static void A() {
        System.out.println("A()");
    }

    void B() {
        System.out.println("B()");
    }
    public static void main(String[] args) {
    A();

    // B();  don't work.

    Program prog = new Program(); // Экземпляр класса программ.
    prog.B();
    }


}
