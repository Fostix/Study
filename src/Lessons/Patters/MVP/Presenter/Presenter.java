package Lessons.Patters.MVP.Presenter;

import Lessons.Patters.MVP.Model.Model;

public class Presenter {
    private ViewContract viewContract;
    private final Model model;
    public Presenter(Model model) {
        this.model = model;
    }
    public void attachView(ViewContract viewContract) {
        this.viewContract = viewContract;
    }
    public void loadStudents() {
        viewContract.showStudents(model.getRemoteStudents());
        viewContract.showSeparator();
    }
    public void getLocalStudents() {
        viewContract.showStudents(model.getLocalStudents());
        viewContract.showSeparator();
    }
}
