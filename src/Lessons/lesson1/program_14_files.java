package Lessons.lesson1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// throws Exception для избегания ошибок вместо try catch
public class program_14_files {
    public static void main(String[] args) throws Exception {
        try (FileWriter fw = new FileWriter("file.txt", true)) {  // создание либо запись!!!
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) { // если ошибка например: только доступ чтения
            System.out.println(ex.getMessage());
        }


        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();


    }
}
