package Lessons.OOP.Lesson03.Ex004.V2;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> { // Для того что бы явно указать чем можно заполнять репозиторий!!
    List<T> ds; // подключено обобщение.

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

}
