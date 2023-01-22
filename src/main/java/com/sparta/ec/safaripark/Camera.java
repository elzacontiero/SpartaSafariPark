package com.sparta.ec.safaripark;

public class Camera implements IShootable {
    String brand;

    public Camera(String brand) {
        this.brand = brand;
    }

    @Override
    public String shoot() {
        return "shooting a Camera - " + brand;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

