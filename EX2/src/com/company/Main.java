package com.company;

import javax.lang.model.type.PrimitiveType;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<Person>();

        Person person = new Person("Arstan", "Usenov", "Japarovich");
        linkedList.add(person);

        Person person3 = new Person("Artur", "Aspekov", "Сергеевич");
        addCheck(person3, linkedList);

        Person person2 = new Person("Arstan", "Usenov", "Japarovich");
        addCheck(person2, linkedList);

        System.out.println(linkedList);
    }

    static void addCheck(Person personCheck, LinkedList<Person> linkedList) {
        boolean check = false;
        for (Person p: linkedList) {
            if (personCheck.equals(p)) {
                throw new IllegalArgumentException("This person already exists");
            } else {
                check = true;
            }
        }
        if(check) linkedList.add(personCheck);
    }
}
