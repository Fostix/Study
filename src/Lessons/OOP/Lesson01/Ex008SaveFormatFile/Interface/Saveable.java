package Lessons.OOP.Lesson01.Ex008SaveFormatFile.Interface;

import Lessons.OOP.Lesson01.Ex008SaveFormatFile.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path); // Кнопка сохранения.
    // Не нужно обговаривать как реализовывать всё понятно тут.
}
