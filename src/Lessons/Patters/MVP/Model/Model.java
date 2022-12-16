package Lessons.Patters.MVP.Model;

import Lessons.Patters.MVP.Presenter.IGetModel;

import java.util.List;

public class Model implements IGetModel {
    public List<Student> getLocalStudents() {
        return Cache.listOfStudents();
    }
    public List<Student> getRemoteStudents() {
        return Cache.anotherListOfStudents();
    }
}
