package Lessons.OOP.Lesson01.Ex008SaveFormatFile;

import Lessons.OOP.Lesson01.Ex008SaveFormatFile.Applications.Notepad;
import Lessons.OOP.Lesson01.Ex008SaveFormatFile.Format.Doc;
import Lessons.OOP.Lesson01.Ex008SaveFormatFile.Format.Md;
import Lessons.OOP.Lesson01.Ex008SaveFormatFile.Format.Txt;

public class Program {
    public static void main(String[] args) {
        
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());



    }
}
