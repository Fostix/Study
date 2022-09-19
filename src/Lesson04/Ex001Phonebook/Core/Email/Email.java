package Lesson04.Ex001Phonebook.Core.Email;

public class Email implements Cloneable {
    private String email;

    public Email(String email) {
        if (checkValid(email))
            this.email = email;

    }

    public boolean checkValid(String email) {
        if (email.contains("@")) {
            return true;
        }
        return false;
    }

    public Email getEmail() {
        return new Email(this.email);
    }

    public boolean regEmail(String email) {
        if (checkValid(email)) {
            this.email = email;
            return true;
        }
        return false;
    }
}
