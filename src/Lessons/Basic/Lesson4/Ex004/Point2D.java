package Lessons.Basic.Lesson4.Ex004;

public class Point2D {
    int x, y;

    public Point2D(int valueX, int valueY) { // Это не метод, нет возвращаемого элемента!!
        x = valueX;
        y = valueY;
    }

    public Point2D() {
        x = 0;
        y = 0;
    }

    public Point2D(int value) {
        x = value;
        y = value;
    }

}