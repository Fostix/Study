package Lesson05;

// Dependency inversion principle
// Принцип инверсии зависимостей
// модули высокого уровня не должны зависеть
// от модулей нижнего уровня.
// И те, и другие должны зависеть от абстракций.
// абстракции не должны зависеть от деталей.
// Детали должны зависеть от абстракций.

public class Ex005_1DIR {
    public static void main(String[] args) {
        Book book = new Book();
        book.viewAuthor();
    }
}

interface View {
    void print(String text);
}

class ConsoleView implements View {
    public void print(String text) {
        String result = String.format("ConsoleView %s", text);
    }
}

class WinFormView implements View {
    public void print(String text) {
        String result = String.format("WinFormView %s", text);
        System.out.println(result);
    }
}

class Book {
    View view;

    int indexPage;

    public Book() {
        this.view = new ConsoleView();
        indexPage = 1;
    }

    public void viewTittle() {
        view.print("Заголовок книги");
    }

    public void viewAuthor() {
        view.print("Авторы книги");
    }

    public void turnPage(int page) {
        if (page >= 1 && page <=300)
            this.indexPage = page;
    }

    public void viewCurrentPage() {
        view.print(String.format("Страница: %s", indexPage));
    }
}
