package com.sparta.ec.safaripark.polymorphism;


// Abstract class is just a generic that that contains the common code between
// the weapons. So, you cannot come to me and say, give me a weapon. you've got
// to be specific which weapon you want.
// you take a code that is common, and you put in an abstract class.

public abstract class Weapon implements IShootable {

    String brand;

    public Weapon(String brand) { // Constructor as it has same name of class.
        this.brand = brand;
    }

    @Override // you say to the compiler: make sure I am rewriting some parent method.
    public String shoot() {
        return "Shooting a " + brand;
    }

    @Override // overriding the Object.toString() default implementation.
    public String toString() {
        return "Weapon{ brand='" + brand + "' }";
    }

}
// method toString return a string representation of the object.
