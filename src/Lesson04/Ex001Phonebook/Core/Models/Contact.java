package Lesson04.Ex001Phonebook.Core.Models;

import java.time.LocalDate;

public class Contact implements Comparable<Contact>{ // Модель не в контексте MVP паттерна, а в контексте данных.
    public LocalDate date;
    public String firstName; // work data.db
    public String lastName; // work
    public String company; // try to create save information. data.db
    public String phone; // !!
    //public Email email; // !! нужно сделать валидность!!
    //public String email; // !!
    public String description; // work

    public Contact(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }


    @Override
    public int compareTo(Contact o) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Contact t = (Contact) obj;
        return this.firstName == t.firstName
                && this.lastName == t.lastName
                ;
    }
}
