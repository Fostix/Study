package Lessons.lesson1;

public class program_9_variable_scopes {
    static int t = 878;
    public static void main(String[] args) {
        // int a = 123;
        int b = 111;
        {
            int a = 234;
            System.out.println(a + b);
        }
        int a = 675;
        System.out.println(a);


    }
}
