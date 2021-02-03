package com.company;

public class Coke implements Cylindrical{
    private String size;

    public Coke(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String msg = String.format("This a %s coke", size);
        return msg;
    }
}
