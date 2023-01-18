package com.sparta.ec.safaripark;

public class Airplane extends Vehicle {
    private int altitude = 0;
    private String airline;

    public Airplane(int capacity, int speed, String airline) {
        super(capacity, speed);
        this.airline = airline;
    }

    public int getAltitude() {
        return altitude;
    }

    public String getAirline() {
        return airline;
    }

    public void ascend(int distance) {
        altitude += distance; // ascends increases the altitude by distance meters
    }

    public void descend(int distance) {
        altitude -= distance; // descend diminishes the altitude by 'distance' meters
    }

    @Override
    public String move() {
        return "Moving along at an altitude of " + altitude + " metres.";
    }

    @Override
    public String move(int times) {
        return "Moving along " + times + " times at an altitude of " + altitude + " metres.";
    }

    @Override
    public String toString() {
        return super.toString() + " Airplane{airline=" + airline + ", altitude=" + altitude + "}";
    }
}
