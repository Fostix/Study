package Lessons.OOP.Lesson04.Ex001Phonebook.Core.Infrastructure;

import Lesson04.Ex001Phonebook.Core.Models.Contact;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    // create
    public boolean add(Contact contact) {
        boolean flag = false;
        if(!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    // read
    public Contact getContact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

    // update
    // Попробовать добавить функционал.

    // delete
    public boolean remove(Contact contact) {
        boolean flag = false;
        if(contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }

    private boolean contains(int index) {
        return contacts != null
                && contacts.size() > index;
    }

    public List<Contact> getContacts() {
        // if create functional!!
        return contacts;
    }

    public int count() {
        return contacts.size();
    }

}
