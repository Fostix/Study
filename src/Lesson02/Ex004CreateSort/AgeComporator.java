package Lesson02.Ex004CreateSort;

import java.util.Comparator;

public class AgeComporator implements Comparator<Worker> {
    // Отдельная компонента отвечающая за упорядочивание
    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
