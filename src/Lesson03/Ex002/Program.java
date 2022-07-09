package Lesson03.Ex002;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        Worker w = new Worker(28, "firstName", "lastName", 18, 9);

        // #region ParameterizedWorker

        ParameterizedWorker<Integer> w1 = new ParameterizedWorker<>(234, "firstName", "lastName", 20, 22);

        String uid = UUID.randomUUID().toString();
        ParameterizedWorker<String> w2 = new ParameterizedWorker<>(uid, "firstName", "lastName", 20, 22);
        //System.out.println(w2.getId());



    }
}
