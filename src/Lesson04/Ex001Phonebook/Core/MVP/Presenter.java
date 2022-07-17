package Lesson04.Ex001Phonebook.Core.MVP;

import Lesson04.Ex001Phonebook.Core.Models.Contact;

import static Lesson04.Ex001Phonebook.Config.pathDb;

public class Presenter {

    private Model model;
    private View view;

    public Presenter(View view, Model model) {
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
        }
    }

    public void add() {
        model.currentBook().add(new Contact(view.getFirstName(), view.getLastName(), view.getDescription()));
    }

    public void saveTofile() {
        model.save();
    }


    public void prev() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > - 1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currectContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);
            }
        }
    }




}
