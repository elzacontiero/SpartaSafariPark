package com.sparta.ec.safaripark;


public abstract class Weapon implements IShootable {

    String brand;

    public Weapon(String brand) {
        this.brand = brand;
    }

    @Override
    public String shoot() { // Shoot method
        return "Shooting a " + brand;
    }

    // overriding the Object.toString() default implementation.
    @Override
    public String toString() {
        return "Weapon{ brand='" + brand + "' }";
    }

}

