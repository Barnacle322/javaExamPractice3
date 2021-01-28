package com.company;

import java.net.FileNameMap;

public class Person {
    private String fName;
    private String lName;
    private String mName;

    public Person(String fName, String lName, String mName) {
        this.fName = fName;
        this.lName = lName;
        this.mName = mName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return lName.equals(person.lName) && fName.equals(person.fName) && mName.equals(person.mName);
    }

    @Override
    public String toString() {
        String msg = String.format("%s %s %s", this.lName, this.fName, this.mName);
        return msg;
    }
}
