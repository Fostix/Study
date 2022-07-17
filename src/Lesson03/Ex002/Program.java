package Lesson03.Ex002;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        Worker w = new Worker(28, "firstName", "lastName", 20, 22);

        //#region ParameterizedWorker
        ParameterizedWorker<Integer> w1 = new ParameterizedWorker<>(1990, "fistName", "lastName", 20, 22);
        System.out.println(w1.getId());

        String uid = UUID.randomUUID().toString();
        ParameterizedWorker<String> w2 = new ParameterizedWorker<>(uid, "fistName", "lastName", 20, 22);
        System.out.println(w2.getId());
        //#endregion

        //#region MultiParameterized
        MultiParameterized<Integer, Double, String> mp1 = new MultiParameterized<>(1, 1.2, "Бармалей");
        System.out.println(mp1);
        MultiParameterized<String, String, String> mp2 = new MultiParameterized<>("Бармалей1", "Бармалей_2", "Бармалей_2");
        System.out.println(mp2);
        //#endregion
    }
}
