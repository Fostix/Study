package Lesson03.Ex004.V1;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Content> ds; // Обобщение листа Content проблема, решается поключение обобщений пример V2.

    private String name;

    public Repository(String name){
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n >> %s created\n", this.name); // в общем случае этого метода быть не должно
    }

    public void add(Content content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }


    public Content get(Integer index) {
        return ds.get(index);
    }

    // реализовать возможность работы с foreach
}
