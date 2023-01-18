package com.sparta.ec.safaripark;

import com.sparta.ec.safaripark.polymorphism.Camera;
import com.sparta.ec.safaripark.polymorphism.Hunter;
import com.sparta.ec.safaripark.polymorphism.IShootable;

import java.util.ArrayList;
import java.util.List;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane a = new Airplane(200, 100, "JetRUs");
        a.setNumPassengers(157);
        a.ascend(500);
        System.out.println(a.move(3)); // print the move 3 times
        System.out.println(a); // print the object (a.toString())
        a.descend(200);
        System.out.println(a.move());
        a.move();
        System.out.println(a);
        a.descend(500);
        System.out.println(a);

        System.out.println("==== Adding to List ====");
        List<Object> myObjects = new ArrayList<>();

        myObjects.add(a);
        IShootable shootable = new Camera("Leica");
        myObjects.add(new Hunter("Elza","Contiero", 15, shootable)); // creating a new Hunter and adding to myObjects list
        myObjects.add(new Person("Joe", "Safari", 35));
        myObjects.add(new Vehicle(8, 2)); // Vehicle(capacity=8, speed=2)

        //in a loop, call the toString() method on each object
        for (Object o : myObjects) {
            System.out.println(o.toString());
        }



    }
        public static void spartaWrite (Object obj){
            System.out.println(obj);
        }

        public static void safariWrite(Person p){
            System.out.println(p);
        }
}
