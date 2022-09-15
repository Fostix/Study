package Lesson04.Ex002Math.Core.Model;

import Lesson04.Ex002Math.Mathematics.CalculateArea.Calculate;
import Lesson04.Ex002Math.Mathematics.Shapes.Canvas;
import Lesson04.Ex002Math.Mathematics.Shapes.Shape;

public class Model {
    Shape panel;
    Calculate calc;

    public Model(Calculate c, String canvasName) {
        panel = new Canvas(canvasName); //"withot name (2),jpg;" ?????
        calc = c;
    }

    public void append(Shape shape) {
        panel.shapes.add(shape);
    }

    public double area() {
        return calc.visit(panel);
    }

    public String show() {
        return panel.toString();
    }
}
