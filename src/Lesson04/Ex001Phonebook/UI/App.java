package Lesson04.Ex001Phonebook.UI;

import Lesson04.Ex001Phonebook.Config;
import Lesson04.Ex001Phonebook.Core.MVP.Presenter;
import Lesson04.Ex001Phonebook.Core.MVP.View;

import java.util.Scanner;

public class App {
    public void ButtonClick() {
        // System.out.print("\033[1;1H\033[0J"); // stacko???
        System.out.print("\r" + ""); // stacko???
        View view = new NewConsoleView(); // ConsoleView можно указать старую консоль
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.loadFromFile();

        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println(" 1 - prev 2 - next");
                String key = in.next();
                // System.out.print("\033[1;1H\033[0J");
                System.out.print("\r" + "");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    default:
                        System.out.println("Такой команды нет!!");
                        break;
                }
            }
        }
    }
}
