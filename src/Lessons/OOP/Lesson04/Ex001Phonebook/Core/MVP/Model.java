package Lessons.OOP.Lesson04.Ex001Phonebook.Core.MVP;

import Lesson04.Ex001Phonebook.Core.Infrastructure.Phonebook;
import Lesson04.Ex001Phonebook.Core.Models.Contact;

import java.io.*;

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

    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
//            String fname = reader.readLine();
//            while (fname != null) {
//                String lname = reader.readLine();
//                String description = reader.readLine();
////                System.out.println(phone.charAt(0) + "  = here test");
//                String phone = reader.readLine();
//                if (phone.charAt(0) == '*') {
//                    this.currentBook.add(new Contact(fname, lname, description, phone));
//                } else {
//                    this.currentBook.add(new Contact(fname, lname, description));
//                }
//                fname = reader.readLine();
//            }
            String fname;
            do {
                fname = reader.readLine();
                String lname = reader.readLine();
                String description = reader.readLine();
//              System.out.println(phone.charAt(0) + "  = here test");
                String check = reader.readLine(); // here problem!!
                System.out.println(check);
                checkDop(check);

                if (check.charAt(0) == '*') {
                    this.currentBook.add(new Contact(fname, lname, description, check));
                } else {
                    this.currentBook.add(new Contact(fname, lname, description));
                }
            } while (fname != null);
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkDop(String check) {
        char j = check.charAt(0);
        switch (j) {
            case 'p':

        }
    }

    public void save() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++){
                Contact contact = currentBook.getContact(i);
                writer.append(String.format("%s\n", contact.firstName));
                writer.append(String.format("%s\n", contact.lastName));
                writer.append(String.format("%s\n", contact.description));
                // writer.append(String.format("%s\n", contact.phone)); // think
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    public Phonebook currentBook() {
        return this.currentBook;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
}
