package Lessons.OOP.Lesson04.Ex001Phonebook.Core.MVP;

import Lessons.OOP.Lesson04.Ex001Phonebook.Core.Models.Contact;

public class Presenter {

    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        this.model = new Model(pathDb);
    }


    public void loadFromFile() {
        model.load();

        if(model.currentBook.count() > 0) {
            model.setCurrentIndex(0);
            var contact = model.currectContact();

            view.setFirstName(contact.firstName);
            view.setLastName(contact.lastName);
            view.setDescription(contact.description);
            if (contact.checkPhone())
                view.setPhoneNumber(contact.phone);
        }
    }

    public void add() {
        model.currentBook().add(new Contact(view.getFirstName(), view.getLastName(), view.getDescription()));// email // maybe here add for show
    }

    public void remove() {
        Contact contact = new Contact(view.getFirstName(), view.getLastName(), view.getDescription());
        model.currentBook().remove(contact);

        if (model.currentBook().count() < 1) {
            model.setCurrentIndex(-1);

            view.setFirstName("");
            view.setLastName("");
            view.setDescription("");
        } else {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);

            Contact temp = model.currectContact();
            view.setFirstName(temp.firstName);
            view.setLastName(temp.lastName);
            view.setDescription(temp.description);
        }
    }

    public void saveToFile() {
        model.save();
    }

    public void next() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.currectContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);
                if (contact.checkPhone())
                    view.setPhoneNumber(contact.phone);
            }
        }
    }

    public void prev() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > - 1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currectContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);
                if (contact.checkPhone())
                    view.setPhoneNumber(contact.phone);
            }
        }
    }
}
