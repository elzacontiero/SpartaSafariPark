package com.sparta.ec.polymorphism;


import com.sparta.ec.safaripark.Hunter;
import com.sparta.ec.safaripark.IShootable;
import com.sparta.ec.safaripark.LaserGun;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HunterTest {
    @Test
    public void testHunter() {
        IShootable s = new LaserGun("ACME");
        Hunter h = new Hunter("Top","Gun", 66, s);
        Assertions.assertEquals("Top Gun is Zing!! Shooting a LaserGun - ACME", h.shoot());
        Assertions.assertEquals("Person{firstName='Top', lastName='Gun', age=66} LaserGun{brand='LaserGun - ACME'}", h.toString());
        Assertions.assertEquals("Top Gun is moving", h.move());
    }
}
