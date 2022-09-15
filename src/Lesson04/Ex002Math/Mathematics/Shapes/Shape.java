package Lesson04.Ex002Math.Mathematics.Shapes;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    // abstract для того что бы нельзя
    // было создать фигуру типа фигуры.
    protected double area; // площадь фигуры.
    protected String name; // имя фигуры.

    /** Получение площади*/
    public double getArea() {
        return area;
    }

    /** Изменение площади фигуры скрытый от пользователя,
     * для того что бы пользователь не мог подменить
     * значения, а то результат будет некорректным*/
    protected void setArea(double value) {
        area = value;
    }

    public void setName(String value) {
        name = value;
    }

    public String getName() {
        return name;
    }

    public List<Shape> shapes = new ArrayList<>();

    public void Print(StringBuilder sb, String indent) {
        sb.append(String.format("%s %s %s\n", indent, name, getClass()));

        for (Shape shape : shapes) {
            shape.Print(sb, indent + "  ");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Print(sb, "");
        return sb.toString();
    }
}
