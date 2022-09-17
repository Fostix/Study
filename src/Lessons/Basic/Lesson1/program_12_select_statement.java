package Lessons.Basic.Lesson1;


public class program_12_select_statement {
    public static void main(String[] args) {
        int a = 1;

        switch (a) {
            case 1: System.out.println("a"); // be continuing if not break
            case 2:
                System.out.println("b");
                //break;
            case 3:
            case 5:
            case 6:
            case 10:
                System.out.println("hi");
                //break;
            default:
                System.out.println("hello");
                //break; // will do everything case if not break!!!
        }


    }
}
