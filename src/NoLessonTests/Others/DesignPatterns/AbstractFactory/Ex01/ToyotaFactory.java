package NoLessonTests.Others.DesignPatterns.AbstractFactory.Ex01;

public class ToyotaFactory implements CarsFactory{
    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }
}
