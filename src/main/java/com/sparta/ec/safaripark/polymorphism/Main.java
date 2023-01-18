package com.sparta.ec.safaripark.polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IShootable> theShootables = new ArrayList<>();
        LaserGun gun = new LaserGun(("Acme"));
        WaterPistol pistol = new WaterPistol("Supersoaker");
        Weapon anotherPistol = new WaterPistol("Niagara");
        Camera aCamera = new Camera("Minolta");
        Hunter nish = new Hunter("Nish", "Mandal", 25, aCamera);

        theShootables.add(gun);
        theShootables.add(pistol);
        theShootables.add(anotherPistol);
        theShootables.add(nish);

        for (IShootable shootable : theShootables) {
            System.out.println(shootable.shoot());
        }

        System.out.println("Polymorphic shootout");

        System.out.println(nish.shoot());
        nish.setShootable(gun);
        System.out.println(nish.shoot());
        nish.setShootable(pistol);
        System.out.println(nish.shoot());
        nish.setShootable(anotherPistol);
        System.out.println(nish.shoot());
    }
}
