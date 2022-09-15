package Lesson00.Ex007;

/**
 * Это точка 2D
 */
public class Point2D {
    private int x, y; // toString сработает, но просто просмотреть не получится.

    /**
     * Это конструктор ...
     * @param valueX это координата X
     * @param valueY это координата Y
     */
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

    public int getX() { // Доступ к изменению!!
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value; // this для того что-бы понимать откуда взял это значение!
    }

    public void setY(int value) {
        this.y = value;
    }


    @Override // Переопределение поведение метода.
    public String toString() {
        return String.format("x: %d; y: %d", x, y);
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
