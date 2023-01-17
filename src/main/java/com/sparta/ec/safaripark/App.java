package com.sparta.ec.safaripark;

public class App
{
    public static void main( String[] args )
    {
        Person cathy = new Person("Cathy", "French", 32);

        var fullName = cathy.getFullName();
        System.out.println(fullName);

        Person laura = new Person("Laura", "Tozer", 22);

        var laurasFullName = laura.getFullName();
        System.out.println(laurasFullName);

        var age = laura.getAge();
        System.out.println(age);

        Person parmita = new Person("parmita");

        laura.setAge(35);
        var laurasNewAge = laura.getAge();
        System.out.println(laurasNewAge);

        Hunter h = new Hunter();
        Hunter h1 = new Hunter("Marion", "Jones", 32, "Leica.");
        System.out.println(h1.getFullName());
        System.out.println(h1.shoot());
        Hunter h3 = new Hunter("Marion", "Jones", 32, "Leica.");
        boolean same = h1.equals(h3);
        // equals looks at the memory address and compares h1 with h3.

        // equals from Object class just looks if objects are in the same memory
        // location. h1 and h3 happens to have the same contents, but they are 2
        // different instances (objects) as they occupy 2 different memory addresses.
        // if you want to change this behaviour of equals you can, but you would need
        // to re implement overriding in Hunter by providing a new implementation.

        int h1HashCode = h1.hashCode(); // just gives the hash (the address)
        int h3HashCode = h3.hashCode();
        var type = h1.getClass();// give me an object that represents
        // your class. type is an object that represents the class of h1,
        // or the type of h1.

        System.out.println(h1.toString());// returns a string representation
        // of the object.
    }
}

