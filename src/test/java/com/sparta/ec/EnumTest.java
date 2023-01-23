package com.sparta.ec;

import com.sparta.ec.enums.Planet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EnumTest {

    @Test
    @DisplayName("This is a test for enums")
    public void testEnumJupiter() {
        Planet p = Planet.JUPITER;
        Assertions.assertEquals(778_412_010.0, p.avgDistanceFromSun);
    }

    @Test
    @DisplayName("This is a test for enums for ==")
    public void testEnumForEqualityIdentity() {
        Planet p = Planet.JUPITER;
        Assertions.assertTrue(Planet.JUPITER == p);
    }

    @Test
    @DisplayName("This is a test for enums for equals()")
    public void testEnumForEquality() {
        Planet p = Planet.JUPITER;
        Assertions.assertTrue(Planet.JUPITER.equals(p));
    }

}
