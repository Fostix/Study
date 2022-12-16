package Lessons.Patters.MVP.Presenter;

import Lessons.Patters.MVP.Model.Student;

import java.util.List;

public interface IGetModel {
    List<Student> getLocalStudents();
    List<Student> getRemoteStudents();

}
