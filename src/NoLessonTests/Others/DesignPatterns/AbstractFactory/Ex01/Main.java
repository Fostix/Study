package NoLessonTests.Others.DesignPatterns.AbstractFactory.Ex01;

public class Main {
    public static void main(String[] args) {
        CarsFactory factory;

        factory = new ToyotaFactory();
        Object car = factory.createSedan();
        System.out.println(car);

        factory = new NissanFactory();

        factory.createCoupe();

        factory = new FordFactory();
        factory.createSUV();
    }
}
