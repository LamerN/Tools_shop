package com.example.toolsshop;

public class Drill {
    private String title;
    private String info;
    private int id;

    public Drill(String name, String info, int id) {
        this.title = name;
        this.info = info;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getId() {
        return id;
    }
}
