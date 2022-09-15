package Lesson04.Ex000Calc;

public class Program {
    public static void main(String[] args) {
//        var m = new SumModel();
//        var v = new View();
//        Presenter p = new Presenter(m, v);
//        p.buttonClick();

//        p = new Presenter(new SumModel(), new View());
//        p.buttonClick();
//        p.buttonClick();
//        p.buttonClick();
//        p.buttonClick();

        PresenterOfT p = new PresenterOfT(new SumModel(), new View());
        p.buttonClick();
        p.buttonClick();

    }
}
