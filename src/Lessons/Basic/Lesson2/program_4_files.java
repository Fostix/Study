package Lessons.Basic.Lesson2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class program_4_files {
    public static void main(String[] args) {
//        try {
//            Код, в котором может появиться ошибка
//        } catch (Exception e) {
//            Обработка, если ошибка случилась
//        }
//        finally {
//            Код, который выполнится в любом случае
//        }

        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally
        { System.out.println("finally"); }


        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

        String line = "empty";
        try {
            String pathFile = "123.txt";
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created"); }
            else {
                BufferedReader bufReader =
                        new BufferedReader(new FileReader(file));
                System.out.println("file.existed");
                line = bufReader.readLine();
                bufReader.close(); }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            System.out.println(line);
        }

    }
}
