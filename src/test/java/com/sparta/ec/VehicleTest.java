package com.sparta.ec;

import com.sparta.ec.safaripark.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VehicleTest {

    @Test
    @DisplayName("Test speed 1")
    public void speedTest1() {
        // 1st constructor: Default speed is 10
        Vehicle v = new Vehicle();
        Assertions.assertEquals(10, v.getSpeed());
    }

    @Test
    @DisplayName("Test speed 2")
    public void speedTest2() {
        // 2nd constructor
        Vehicle v = new Vehicle(4, 6);// capacity=4, speed=6
        // Assert that the expected speed is what we get from
        // getter v.getSpeed()
        Assertions.assertEquals(6, v.getSpeed());
    }

    @Test
    @DisplayName("Test speed 3")
    public void speedTest3() {
        // 3rd constructor
        Vehicle v = new Vehicle(4, 7, 12, 5);
        Assertions.assertEquals(5, v.getSpeed());
    }

    @Test
    @DisplayName("Test Position")
    public void positionTest() {
        // 1st constructor: Default position is 0
        Vehicle v = new Vehicle();
        Assertions.assertEquals(0, v.getPosition());

        // 2nd constructor
        v = new Vehicle(4, 6);// capacity=4, speed=6

        Assertions.assertEquals(0, v.getPosition());

        // 3rd constructor
        v = new Vehicle(4, 7, 12, 5);
        Assertions.assertEquals(12, v.getPosition());
    }

    @Test
    @DisplayName("Test number of passengers.")
    public void numPassengersTest() {
        Vehicle v = new Vehicle();
        Assertions.assertEquals(0, v.getNumPassengers());

        v = new Vehicle(4, 6);

        Assertions.assertEquals(0, v.getNumPassengers());

        v = new Vehicle(4, 7, 12, 5);
        Assertions.assertEquals(7, v.getNumPassengers());
    }


    @Test
    @DisplayName("Test setter for number of passengers")
    public void numPassengersSetterTest() {
        Vehicle v = new Vehicle(); // default capacity is 4!
        v.setNumPassengers(3);
        Assertions.assertEquals(3, v.getNumPassengers());


        boolean gotAnException = false;
        try {
            v.setNumPassengers(-1); // throws RuntimeException
        } catch(RuntimeException e) {
            gotAnException = true;
        }
        Assertions.assertTrue(gotAnException);

        gotAnException = false;
        try {
            v.setNumPassengers(5); // throws RuntimeException
        } catch(RuntimeException e) {
            gotAnException = true;
        }
        Assertions.assertTrue(gotAnException);
    }

    @Test
    @DisplayName("Capacity Test")
    public void capacityTest() {
        Vehicle v = new Vehicle();
        Assertions.assertEquals(0, v.getNumPassengers());

        v = new Vehicle(4, 6);

        Assertions.assertEquals(0, v.getNumPassengers());

        v = new Vehicle(4, 7, 12, 5);
        Assertions.assertEquals(7, v.getNumPassengers());
    }

    @Test
    @DisplayName("Test move")
    public void moveTest() {
        Vehicle v = new Vehicle();
        // default initial position is zero
        // and default speed is 10
        v.move();
        Assertions.assertEquals(10, v.getPosition());
    }

    @ParameterizedTest
    @DisplayName("Test ")
    @CsvSource({
        "0, 10, 2, 20",
        "10, 20, 4, 90",
        "0, -10, 3, -30"
    })
    public void moveTimesTest(int position, int speed, int times, int expectPosition) {
        Vehicle v = new Vehicle(4, 4, position, speed);
        v.move(times);
        Assertions.assertEquals(expectPosition, v.getPosition());
    }
}
