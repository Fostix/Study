package Lessons.Basic.Lesson4.Ex002;

public class Program {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


//    static double distance(int a, int b, int c, int d) { // Сигнатуры одинаковые. Перегрузка по имени аргументов
//        return 0;
//    }
//
//    static double distance(int a, int b, int c) { // Работает
//        return 0;
//    }


//    static double distance(int a, int b, int c, double d) { // Работает
//        return 0;
//    }

    static double distance(Point2D a, Point2D b) {

        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(); // Экземпляр класса точка. Размещается в стеке всё остальное в куче. Конструктор класса.
        a.x = 0; // Пока не вызвать конструктор класса компилятор не поймёт где, хранить координаты!!!
        a.y = 2; // В точку инкапсулировали координаты
        System.out.println(a.toString());

        Point2D b = new Point2D();
        b.x = 0;
        b.y = 10;
        System.out.println(b.toString());
        System.out.println(distance(a, b));
    }
}
