package com.sparta.ec.safaripark;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(6, 4, 0, 20);
        v.move(); // after 1 move, position is 20. position=20
        v.move(4); // Position starts from 20 and moves 4 times 20, then = 100
        System.out.println("My vehicle has capacity of " + v.getCapacity() + " passengers.\n" +
                "Currently holds only " + v.getNumPassengers() + " passengers.\n" +
                "We are currently at position " + v.getPosition() +
                " and moving at " + v.getSpeed() + " mph."
        );
    }
}
