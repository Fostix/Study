package Lesson03.Ex004.V4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Repository<T extends Content> extends Content{ // Для того что бы явно указать чем можно заполнять репозиторий!!
    // only add extends Content
    // Тип Т должен быть в одной иерархии с типом Content, причём должен находится ниже!! upcast downcast.
    List<T> ds; // Обобщение листа Content проблема, решается подключение обобщений пример V2.

    private String name;
    int index;


    public Repository(String name){
        super(name);
        this.ds = new ArrayList<>();
        this.name = name;
        index = 0;
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

    public Iterator<Content> iterator() {
        Iterator<Content> iter = new Iterator<Content>() {

            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < ds.size();
            }

            @Override
            public Content next() {
                return ds.get(index++);
            }
        };
        return iter;
    }



    // реализовать возможность работы с foreach

    // merge function try crate
}
