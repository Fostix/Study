package Lessons.OOP.Lesson04.Ex002Math.Core.Presenter;

import Lesson04.Ex002Math.Core.Infrastructure.Generator;
import Lesson04.Ex002Math.Core.Model.Model;
import Lesson04.Ex002Math.Core.Views.View;
import Lesson04.Ex002Math.Mathematics.Exceptions.UnacceptableValueException;
import Lesson04.Ex002Math.Mathematics.Shapes.Circle;
import Lesson04.Ex002Math.Mathematics.Shapes.Rectangle;
import Lesson04.Ex002Math.Mathematics.Shapes.Shape;

public class Presenter {
    Model model;
    View view;

    public Presenter(View view, Model model) {
        this.model = model;
        this.view = view;
    }

    public void append() throws UnacceptableValueException {
        view.set("1 - Circle, 2 - Reactangle");
        String response = view.get();
        Shape figure;

        switch (response) {
            case "1":
                figure = Circle.create(Generator.number(), "Circle_" + Generator.number());
                break;
            default:
                figure = Rectangle.create(
                        Generator.number(),
                        Generator.number(),
                        "Rectangle_" + Generator.number());
                break;
        }

        model.append(figure);
        view.set("ok");
    }

    public void show() {
        view.set(model.show());
    }

    public void showArea() {
        view.set(String.format("all Area %s", model.area()));
    }
}
