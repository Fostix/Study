package Lessons.lesson7.OOP;

public class Worker { // код для примера
    // Поля.
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override // Для переопределения базового поведения.
    public String toString() {
        String res = String.format("id: %d fn: %s ln %s sl %d", id, firstName, lastName, salary);
        return res;
    }

        @Override
        public boolean equals(Object o) {
            var t = (Worker) o;
            return id == t.id && firstName == t.firstName; // Пример. Может быть потребуется сравнение больше полей.
        }
        @Override
        public int hashCode() {
            return id;
         }
}

