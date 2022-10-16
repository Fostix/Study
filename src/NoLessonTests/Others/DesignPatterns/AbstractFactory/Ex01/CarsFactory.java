package NoLessonTests.Others.DesignPatterns.AbstractFactory.Ex01;

public interface CarsFactory {
    Sedan createSedan();
    Coupe createCoupe();

    SUV createSUV();
}
