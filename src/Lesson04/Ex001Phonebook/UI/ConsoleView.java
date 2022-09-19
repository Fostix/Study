package Lesson04.Ex001Phonebook.UI;

import Lesson04.Ex001Phonebook.Core.MVP.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in);
    }

    @Override
    public String getFirstName() {
        System.out.print("FirstName: ");
        return in.nextLine();
    }

    @Override
    public void setFirstName(String value) {
        System.out.printf("FirstName: %s\n", value);
    }

    @Override
    public String getLastName() {
        System.out.print("LastName: ");
        return in.nextLine();
    }

    @Override
    public void setLastName(String value) {
        System.out.printf("LastName: %s\n", value);
    }

    @Override
    public String getDescription() {
        System.out.print("Description: ");
        return in.nextLine();
    }

    @Override
    public void setDescription(String value) {
        System.out.printf("Description: %s\n", value);
    }

    @Override
    public void setPhoneNumber(String value) {
        System.out.printf("Phone: %s\n", value);
    }
}
