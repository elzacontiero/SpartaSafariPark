package com.sparta.ec.polymorphism;


import com.sparta.ec.safaripark.polymorphism.Camera;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CameraTest {
    @Test
    public void testShoot() {
        Camera c = new Camera("ACME");
        Assertions.assertEquals("shooting a Camera - ACME", c.shoot());
        Assertions.assertEquals("Camera{brand='ACME'}", c.toString());
    }
}

