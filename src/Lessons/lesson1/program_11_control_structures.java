package Lessons.lesson1;

public class program_11_control_structures {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);


        int a1 = 1;
        int b1 = 2;
        int c1 = 0;
        if (a1 > b1) c1 = a1;
        if (b1 > a1) c1 = b1;
        System.out.println(c1);



        int a2 = 1;
        int b2 = 2;
        int min = a2 < b2 ? a2 : b2; // if a2 less than b2 to return a2.
        System.out.println(min);

    }
}
