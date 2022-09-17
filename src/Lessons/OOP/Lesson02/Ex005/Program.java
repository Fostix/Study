package Lessons.OOP.Lesson02.Ex005;

public class Program {
    public static void main(String[] args) {
//        Worker1 w1 = new Worker1("Name", "Surname", 12, 9999999);
//        Worker1 w2 = new Worker1("Hi", "Ih", 13, 2);

//        Worker2 w1 = new Worker2("Name", "Surname", 12, 9999999);
//        Worker2 w2 = new Worker2("Hi", "Ih", 13, 2);
//
//
//        System.out.println(w1 == w2);
//
//        System.out.println(w1.compareTo(w2));
//        System.out.println(w2.compareTo(w1));
//
//        System.out.println(w1.equals(w2));
//        System.out.println(w2.equals(w1));
//
//        System.out.println(w1.hashCode());
//        System.out.println(w2.hashCode());


        Worker3 w1 = new Worker3("Name", "Surname", 12, 9999999);
        Worker3 w2 = new Worker3("Hi", "Ih", 14, 2);

        System.out.println(w1 == w2);

        System.out.println(w1.equals(w2));
        System.out.println(w2.equals(w1));


        System.out.println(w1);
        System.out.println(w2);

        w1.age = 31;

        System.out.println(w1);
        System.out.println(w2);

        System.out.println(w1.hashCode() + "  age hash code");
        System.out.println(w2.hashCode() + "  age hash code");

    }

}
