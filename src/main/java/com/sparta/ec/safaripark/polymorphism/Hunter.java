package com.sparta.ec.safaripark.polymorphism;

import com.sparta.ec.safaripark.Person;


public class Hunter extends Person implements IShootable {

    private IShootable shootable;

    public Hunter() {}

    public Hunter(String firstName, String lastName, int age, IShootable shootable) {
        super(firstName, lastName, age);
        this.shootable = shootable;
    }

    public String shoot() {
         return getFullName() + " is " + shootable.shoot();
    }

@Override
    public String toString() {
         return super.toString() + " " + shootable.toString();
         // However, this string might give the reader the impression that we're talking
        // about two objects: Person and Hunter, whereas they are a single object.
    }

    // getter + setters for shootable:
    public IShootable getShootable() {
        return shootable;
    }

    public void setShootable(IShootable shootable) {
        this.shootable = shootable;
    }
//    @Override
//    public String toString() {
//        return "Hunter" +
//                "{" + "camera='" + camera + '\'' + " name=" + getFullName() + " age="+  getAge() +'}';
//    }
}

