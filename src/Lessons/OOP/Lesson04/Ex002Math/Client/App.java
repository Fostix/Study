package Lessons.OOP.Lesson04.Ex002Math.Client;


import Lessons.OOP.Lesson04.Ex002Math.Core.Model.Model;
import Lessons.OOP.Lesson04.Ex002Math.Core.Presenter.Presenter;
import Lessons.OOP.Lesson04.Ex002Math.Core.Views.View;
import Lessons.OOP.Lesson04.Ex002Math.Mathematics.CalculateArea.CalculateArea;
import Lessons.OOP.Lesson04.Ex002Math.Mathematics.Exceptions.UnacceptableValueException;

public class App {
    Presenter p;
    View ui;
    Model model;

    public App() {
        ui = new ConsoleView();
        model = new Model(CalculateArea.getInstance(), "Without name.jpg");
        p = new Presenter(ui, model);
    }

    public void start() throws UnacceptableValueException {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - append shape\n")
                .append("2 - show shape\n")
                .append("3 - show all area\n")
                .append("0 - exit\n");

        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    p.append();
                    break;
                case "2":
                    p.show();
                    break;
                case "3":
                    p.showArea();
                    break;
                case "0":
                    return;
            }
        }
    }
}
