package Lessons.Basic.Lesson2;

public class program_2 {
    public static void main(String[] args) {
        String[] name = { "А", "л", "ь", "б", "е", "р", "т"};
        String al = "Альберт.";
        System.out.println(al.toLowerCase());
        System.out.println(String.join("", name));
        System.out.println(String.join("","А", "л", "ь", "б", "е", "р", "т"));
        // Альберт
        System.out.println(String.join(",","А", "л", "ь", "б", "е", "р", "т"));
        // А,л,ь,б,е,р,т
    }
}
