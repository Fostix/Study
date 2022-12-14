package Lessons.OOP.Lesson03.Ex004.V3;

import java.util.ArrayList;
import java.util.List;

public class Repository<T extends Content> { // Для того что бы явно указать чем можно заполнять репозиторий!!
    // only add extends Content
    // Тип Т должен быть в одной иерархии с типом Content, причём должен находится ниже!! upcast downcast.
    List<T> ds; // Обобщение листа Content проблема, решается поключение обобщений пример V2.

    private String name;

    public Repository(String name){
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n >> %s created\n", this.name); // в общем случае этого метода быть не должно
    }

    public void add(T content) { // Content нельзя но можно реализовать!!
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }


    public T get(Integer index) {
        return ds.get(index);
    }

    // реализовать возможность работы с foreach
}
