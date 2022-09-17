package Lessons.OOP.Lesson01.Ex008SaveFormatFile.Format;

import Lesson01.Ex008SaveFormatFile.Document.TextDocument;

import java.io.FileWriter;
import java.io.IOException;

public class Doc extends TextFormat {
    
    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".doc", false)) {
            writer.write("<?Doc Format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
