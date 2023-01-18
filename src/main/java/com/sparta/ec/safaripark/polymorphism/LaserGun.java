package com.sparta.ec.safaripark.polymorphism;

public class LaserGun extends Weapon {
    public LaserGun(String brand) {
        super(brand);
    }

    @Override
    public String shoot() {
        return "Zing!! Shooting a LaserGun - " + brand;
    }

    @Override
    public String toString() {
        return "LaserGun{brand='" + brand + "'}";
    }
}
