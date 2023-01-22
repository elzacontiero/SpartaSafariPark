package com.sparta.ec.safaripark;

public class Hunter extends Person implements IShootable {
    private IShootable shootable;

    public String shoot() {
        return getFullName() + " is " + shootable.shoot();
    }

    public IShootable getShootable() {
        return shootable;
    }

    public void setShootable(IShootable shootable) {
        this.shootable = shootable;
    }


    public Hunter(String firstName, String lastName, int age, IShootable shootable) {
        super(firstName, lastName, age);
        this.shootable = shootable;
    }

    @Override
    public String toString() {
        return super.toString() + " " + shootable.toString();
    }

}

