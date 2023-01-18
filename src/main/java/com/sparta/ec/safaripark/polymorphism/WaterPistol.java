package com.sparta.ec.safaripark.polymorphism;

public class WaterPistol extends Weapon {
    public WaterPistol(String brand) {
        super(brand);
    }

    @Override
    public String shoot() {
        return "Splash!! Shooting a WaterPistol - " + brand;
    }
}
