package wim.models;

import java.util.ArrayList;

public class Person {

    private String name;
    private ArrayList<WorkItems> items;
    private ArrayList<String> history;

    public Person(String name) {
        this.name = name;
        this.items = new ArrayList<>();
        this.history = new ArrayList<>();
    }
}
