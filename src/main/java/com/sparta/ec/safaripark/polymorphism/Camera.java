package com.sparta.ec.safaripark.polymorphism;

public class Camera implements IShootable {
    String brand;

    public Camera(String brand) { //Constructor, same name Class.
        this.brand = brand;
    }

    @Override
    public String shoot() {
        return "shooting a Camera - " + brand;
    }

    @Override
    public String toString() { // double click inside Camera, then generate.
        return "Camera{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

