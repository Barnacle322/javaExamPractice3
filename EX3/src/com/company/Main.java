package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rn = new Random();

        ArrayList<Spherical> sphericalArrayList1 = new ArrayList<Spherical>();
        ArrayList<Spherical> sphericalArrayList2 = new ArrayList<Spherical>();
        ArrayList<Spherical> sphericalArrayList3 = new ArrayList<Spherical>();


        String[] appleColors = new String[]{"Red", "Yellow", "Green"};
        for (int i = 1; i < 20; i++) {
            sphericalArrayList1.add(new Apple(appleColors[rn.nextInt(3)],rn.nextInt(200)+100));
        }

        for (int i = 1; i < 50; i++) {
            sphericalArrayList2.add(new Ball(rn.nextInt(200)));
        }

        for (int i = 1; i < 10; i++) {
            sphericalArrayList3.add(new Apple(appleColors[rn.nextInt(3)],rn.nextInt(200)+100));
        }

        for (int i = 1; i < 3; i++) {
            sphericalArrayList3.add(new Ball(rn.nextInt(200)));
        }

        System.out.println(sphericalArrayList3);

        Backpack backpack = new Backpack(new Coke("Big"), new Book("J.K. Rowling", 500), sphericalArrayList1);
        Backpack backpack2 = new Backpack(new Water("Small"), new Folder(50, "Light Blue"), sphericalArrayList2);
        Backpack backpack3 = new Backpack(new Coke("Medium"), new Folder(100, "Green"), sphericalArrayList3);
    }
}
