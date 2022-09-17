package Lessons.lesson2;

import java.io.File;

public class program_3_files {
    public static void main(String[] args) {
        File f1 = new File("file.txt");
        File f2 = new File("D://GitHub/Java/gb_java_lesson_intellij/src/lesson2/file2.txt");


        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());
        // /Users/sk/vscode/java_projects/file.txt
        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt

    }
}
