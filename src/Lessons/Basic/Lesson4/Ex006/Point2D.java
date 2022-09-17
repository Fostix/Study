package Lessons.Basic.Lesson4.Ex006;

public class Point2D {
    int x, y; // По умолчанию public.

    public Point2D(int valueX, int valueY) { // Это не метод, нет возвращаемого элемента!!
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
//        this.x = value;
//        this.y = value;
        this(value, value); // Вызывая будет использоваться верхний конструктор.
    }

    public Point2D() {
        // this(10, 11);
        this(10); // Каскад вызовов конструкторов.
    }


//    public Point2D() {
//        x = 0;
//        y = 0;
//    }
//
//    public Point2D(int value) {
//        x = value;
//        y = value;
//    }

//    private String getInfo() {
//        return String.format("x: %d; y: %d", x, y);
//    }

    @Override // Переопределение поведение метода.
    public String toString() {
        return String.format("x: %d; y: %d", x, y);
    }
}
