package com.company;

public class Folder implements Flat{
    private int pages;
    private String color;

    public Folder(int pages, String color) {
        this.pages = pages;
        this.color = color;
    }

    @Override
    public String toString() {
        String msg = String.format("This is a %s page %s folder", pages, color);
        return msg;
    }
}
