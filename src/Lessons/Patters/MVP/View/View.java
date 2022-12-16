package Lessons.Patters.MVP.View;

import Lessons.Patters.MVP.Model.Student;
import Lessons.Patters.MVP.Presenter.ViewContract;
import Lessons.Patters.MVP.Presenter.Presenter;

import java.util.List;

public class View implements ViewContract {
    private final Presenter presenter;

    public View(Presenter presenter) {
        this.presenter = presenter;
    }
    public void showStudents(List<Student> students) {
        students.forEach(System.out::println);
    }
    public void showSeparator() {
        System.out.println("----");
    }
}
