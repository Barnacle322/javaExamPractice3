package com.company;

import java.util.ArrayList;

public class Backpack {
    Cylindrical cylindricalObject;
    Flat flatObject;
    ArrayList<Spherical> sphericalObjects;

    public Backpack(ArrayList<Spherical> sphericalObjects) {
        this.sphericalObjects = sphericalObjects;
    }

    public Backpack(Cylindrical cylindricalObject, Flat flatObject, ArrayList<Spherical> sphericalObjects) {
        this.cylindricalObject = cylindricalObject;
        this.flatObject = flatObject;
        this.sphericalObjects = sphericalObjects;
    }

    public Cylindrical getCylindricalObject() {
        return cylindricalObject;
    }

    public void setCylindricalObject(Cylindrical cylindricalObject) {
        this.cylindricalObject = cylindricalObject;
    }

    public Flat getFlatObject() {
        return flatObject;
    }

    public void setFlatObject(Flat flatObject) {
        this.flatObject = flatObject;
    }

    public ArrayList<Spherical> getSphericalObjects() {
        return sphericalObjects;
    }

    public void setSphericalObjects(ArrayList<Spherical> sphericalObjects) {
        this.sphericalObjects = sphericalObjects;
    }
}
