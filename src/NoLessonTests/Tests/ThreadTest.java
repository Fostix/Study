package NoLessonTests.Tests;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print(1);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(2);
            }
        });
        t1.start();
        t2.start();
    }
}
