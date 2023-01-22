package com.sparta.ec.safaripark;

public class Vehicle implements IMovable {
    private int speed = 10;
    private int position;
    private int numPassengers;
    private int capacity = 4;

    public Vehicle() {}

    public Vehicle(int capacity, int speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    public Vehicle(int capacity, int numPassengers, int position, int speed) {
        this.capacity = capacity;
        this.numPassengers = numPassengers;
        this.position = position;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPosition() {
        return position;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) throws RuntimeException {
        if (numPassengers > capacity || numPassengers < 0) {
            throw new RuntimeException("Invalid numPassengers.");
        }
        this.numPassengers = numPassengers;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String move(int times) {
        position += (times*speed);
        return "Moving along " + times + " times";
    }

    @Override
    public String move() {
        position += speed;
        return "Moving along";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", position=" + position +
                ", numPassengers=" + numPassengers +
                ", capacity=" + capacity +
                '}';
    }
}
