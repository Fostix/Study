package Lessons.OOP.Lesson04.Ex001Phonebook.UI;

import Lesson04.Ex001Phonebook.Config;
import Lesson04.Ex001Phonebook.Core.MVP.Presenter;
import Lesson04.Ex001Phonebook.Core.MVP.View;

import java.util.Scanner;

public class App {
    public void ButtonClick() {
        System.out.print("\033[1;1H\033[0J"); // stacko???
        System.out.print("\r" + ""); // stacko???
        View view = new NewConsoleView(); // ConsoleView можно указать старую консоль
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.loadFromFile();

        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println(" 1 - prev 2 - next 3 - add");
                System.out.println(" 4 - loadfromfile 5 - remove 6 - saveToFile");
                String key = in.next();
                System.out.print("\033[1;1H\033[0J");
                System.out.print("\r" + "");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    case "3":
                        presenter.add();
                        break;
                    case "4":
                        presenter.loadFromFile();
                        break;
                    case "5":
                        presenter.remove();
                        break;
                    case "6":
                        presenter.saveToFile();
                        break;
                    default:
                        System.out.println("Такой команды нет!!");
                        break;
                }
            }
        }
    }
}
