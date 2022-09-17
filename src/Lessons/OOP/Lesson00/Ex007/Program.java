package Lessons.OOP.Lesson00.Ex007;


public class Program {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2); // В подсказках созданная документация.
        // System.out.println(a.getInfo()); // private

        // System.out.println(a.getX()); // Изменить значения в конкретном случае не получится
        // System.out.println(a.getY()); // Но можно дополнить конкретным поведением.

        // a.setX(12); // Теперь доступен к изменению


        // Point2D a = new Point2D(0, 2); // Новая точка, размещенная в новом участке памяти.
        // a = new Point2D(); Реиницализация точки
        Point2D b = new Point2D(0); // Конкретный экземпляр
        System.out.println(b);
        System.out.println(b.toString());
//        b.x = 10;
//        b.y = 10;
        //System.out.println(distance(a, b));
        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
