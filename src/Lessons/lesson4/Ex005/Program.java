package Lessons.lesson4.Ex005;


public class Program {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2); // Код который, создает это сущность называют клиентским. Пользовательский конструктор.
        // System.out.println(a.getInfo()); // private
        System.out.println(a);

        // Если что то делать по умолчанию, то будет поведение по умолчанию!
        Point2D b = new Point2D(10); // Конструктор у которых нет аргументов называется конструктором по умолчанию.
        System.out.println(b); // У класса 2д есть свое поведение отвечающее за преобразование этой точки в строку.
        System.out.println(b.toString()); // Значение по умолчанию определяется методом toString
//        b.x = 10;
//        b.y = 10;
        System.out.println(distance(a, b));
    }
}
