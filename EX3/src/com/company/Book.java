package com.company;

public class Book implements Flat{
    private String author;
    private int pages;

    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        String msg = String.format("%s wrote this in %s pages", author, pages);
        return msg;
    }
}
