package Lessons.OOP.Lesson04.Ex001Phonebook.Core.MVP;

public interface View {
    String getFirstName();
    void setFirstName(String value);
    String getLastName();
    void setLastName(String value);
    String getDescription();
    void setDescription(String value);

    void setPhoneNumber(String value);
    // need add more
}
