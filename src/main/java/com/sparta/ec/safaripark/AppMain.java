package com.sparta.ec.safaripark;

import java.util.ArrayList;
import java.util.List;

public class AppMain
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


        Hunter h1 = new Hunter("Marion", "Jones", 32, new Camera("Leica"));
        System.out.println(h1.getFullName());
        System.out.println(h1.shoot());
        Hunter h3 = new Hunter("Marion", "Jones", 32, new Camera("Leica"));
        boolean same = h1.equals(h3);

        int h1HashCode = h1.hashCode();
        int h3HashCode = h3.hashCode();
        var type = h1.getClass();
        System.out.println(h1HashCode + " " + h3HashCode + " " + type.toString());

        System.out.println(h1.toString());

        System.out.println("-----------------------");
        Person yolanda = new Person("Yolanda");

        System.out.println("Moving the objects ----------------------");

        List<IMovable> mOjbects = new ArrayList<>();
        mOjbects.add(laura);
        mOjbects.add(yolanda);
        mOjbects.add(h1);
        mOjbects.add(new Vehicle(4, 100));
        for(var m : mOjbects) {
            System.out.println(m.move());
            System.out.println(m.move(3));
        }
    }
}

