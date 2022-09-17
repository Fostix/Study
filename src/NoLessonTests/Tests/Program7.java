package NoLessonTests.Tests;

public class Program7 {
    // При наличии перегруженных методов java var arg имеет самый низки приоритет
    // к вызову. Из-за обратной совместимости операции боксинга
    // имеют ниже приоритет, чем расширение для более вместимого примитива
    public static void main(String[] args) {
        byte b = 2;
        action(b,b);
    }
    private static void action(byte ... args) {}
    private static void action(long l, short s) {}
    //private static void action(short l, short s) {}
    private static void action(Byte b1, Byte b2) {}
}
