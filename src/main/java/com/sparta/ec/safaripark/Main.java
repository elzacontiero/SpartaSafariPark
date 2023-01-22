package com.sparta.ec.safaripark;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println("----- Expanding the Safari ----");
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cheetah(150, "orange", 20));
        animals.add(new Giraffe(300, "yellow", 15));
        animals.add(new Gorilla(400, "silver", 30));

        // feed them
        for (Animal animal : animals) {
            System.out.println(animal.eat(new Snack("Grass", 200)));
            System.out.println(animal.drink(new WaterBottle(1000)));
            System.out.println(animal.sleep());
        }

        System.out.println("----- Safari Activities -----");

        Participant nishAsParticipant = new Participant(nish);
        nishAsParticipant.feed(new Snack("Potatoes 500g", 2000));
        IActivity shootingCheetah = new ShootingCheetah();
        nishAsParticipant.participate(shootingCheetah);
        System.out.println(nishAsParticipant.toString());

    }
}
