package com.company;

public class Apple implements Spherical{
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        String msg = String.format("%s apple that weighs %s grams", color, weight);
        return msg;
    }
}
