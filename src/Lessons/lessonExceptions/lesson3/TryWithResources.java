package Lessons.lessonExceptions.lesson3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("file.txt");
             FileWriter writer = new FileWriter("write.txt")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception " + e.getClass().getSimpleName());
        }

        System.out.println("Copy successfully");

        try {

        }finally {

        }
    }
}
