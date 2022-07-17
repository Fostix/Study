package Lesson04.Ex001Phonebook.Core.Infrastructure;

import java.util.ArrayList;

public class Phonebook {
    private List<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    public boolean add(Contact contact) {
        boolean flag = false;
        if(!contacts.contains(contact)) {
            contact.add(contact);
            flag = true;
        }
        return flag;
    }

    public Contact getContact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

    //update
    // Попробовать добавить функционал.

    public boolean remove(Contact contact) {
        boolean flag = false;
        if(contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return false;
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
