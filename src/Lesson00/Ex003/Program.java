package Lesson00.Ex003;

public class Program {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2); // Код который, создает это сущность называют клиентским. Пользовательский конструктор.
        System.out.println(a.toString());


        // С этим кодом дальше не компилируется
        // Если что-то делать по умолчанию, то будет поведение по умолчанию.
        // Point2D b = new Point2D(); // Конструктор у которых нет аргументов называется конструктором по умолчанию.

//        b.x = 0;
//        b.y = 10;
//        System.out.println(b.toString());
//        System.out.println(distance(a, b));
    }
}
