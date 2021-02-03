package com.company;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int array[] = new int[100];

        for (int i = 1; i <= 100; i++) {
            array[i-1] = i;
        }

        for (int i: array){
            if ((i % 2) == 0){
                hashSet.add(i);
            }
        }
        // Нельзя поставить какие-то числа в конце сета, ибо в нем нет порядка
        System.out.println(hashSet);
    }
}
