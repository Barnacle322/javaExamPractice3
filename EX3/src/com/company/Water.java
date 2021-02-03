package com.company;

public class Water implements Cylindrical{
    private String size;

    public Water(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String msg = String.format("%s water bottle", size);
        return msg;
    }
}
