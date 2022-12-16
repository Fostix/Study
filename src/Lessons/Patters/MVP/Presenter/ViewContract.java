package Lessons.Patters.MVP.Presenter;

import Lessons.Patters.MVP.Model.Student;

import java.util.List;

public interface ViewContract {
    void showStudents(List<Student> students);
    void showSeparator();
}
