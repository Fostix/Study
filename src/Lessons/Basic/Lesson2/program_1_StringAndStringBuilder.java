package Lessons.Basic.Lesson2;

public class program_1_StringAndStringBuilder {
    public static void main(String[] args) {

        var time = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }
        System.out.println(System.currentTimeMillis() - time);
        // примерно 41000 мс

        var time1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - time1);


    }
}
