package Lessons.LessonExceptions.Lesson2;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("file.txt");
            file.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("Exception while close");;
                }
            }
            System.out.println("finally finished");
        }
    }
}
