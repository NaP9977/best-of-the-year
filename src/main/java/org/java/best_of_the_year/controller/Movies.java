package org.java.best_of_the_year.controller;

public class Movies {
    private int id;
    private String title;

    public Movies(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
