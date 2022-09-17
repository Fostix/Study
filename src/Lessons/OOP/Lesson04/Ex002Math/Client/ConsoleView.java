package Lessons.OOP.Lesson04.Ex002Math.Client;

import Lesson04.Ex002Math.Core.Views.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    @Override
    public String get() {
        return in.next();
    }

    @Override
    public void set(String value) {
        System.out.println(value);
    }
}
