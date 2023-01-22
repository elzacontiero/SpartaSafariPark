package com.sparta.ec.safaripark;

public class LaserGun extends Weapon {
    public LaserGun(String brand) {
        super("LaserGun - " + brand);
    }

    @Override
    public String shoot() {
        return "Zing!! " + super.shoot();
    }

    @Override
    public String toString() {
        return "LaserGun{brand='" + brand + "'}";
    }
}
