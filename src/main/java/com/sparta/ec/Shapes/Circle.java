package com.sparta.ec.Shapes;

public class Circle extends Shape { // use Math class object
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    // is not abstract anymore
    @Override
    public double calculateArea() {
        // area = pi*r^2
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

