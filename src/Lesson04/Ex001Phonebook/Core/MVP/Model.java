package Lesson04.Ex001Phonebook.Core.MVP;

import Lesson04.Ex001Phonebook.Core.Infrastructure.Phonebook;
import Lesson04.Ex001Phonebook.Core.Models.Contact;

public class Model {
    Phonebook currentBook;
    private int currentIndex;
    private String path;

    public Model(String path) {
        currentBook = new Phonebook();
        currentIndex = 0;
        this.path = path;
    }

    public Contact currectContact() {
        if (currentIndex >= 0) {
            return currentBook.getContact(currentIndex);
        } else {
            // create something!!
            return null;
        }
    }

    public Phonebook currentBook() {
        return this.currentBook;
    }

    public Phonebook getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
}
