package NoLessonTests.Others.DesignPatterns.AbstractFactory.Ex01;

public class FordFactory implements CarsFactory{
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }

    @Override
    public SUV createSUV() {
        return new FordSUV();
    }
}
