package NoLessonTests.Others.DesignPatterns.AbstractFactory.Ex01;

public class NissanFactory implements CarsFactory{
    @Override
    public Sedan createSedan() {
        return new NissanSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new NissanCoupe();
    }
}
