package com.sparta.ec.enums;

public enum Planet {
    // Scientific notation for doubles: E = 3.3*10^23 "3.3 ten to the power of 23"
    // Inside the list of enums, they are separated by comma: ,
    MERCURY("Mercury", 57_909_175.0, 3.302E23),
    VENUS("Venus", 108_208_930.0, 4.8690E24),
    EARTH("Earth", 149_597_890.0, 5.972E24),
    MARS("Mars", 227_936_640.0, 6.4191E23),
    JUPITER("Jupiter", 778_412_010.0, 1.8987E27),
    SATURN("Saturn", 1_426_725_400.0, 5.6851E26),
    URANUS("Uranus", 2_870_972_200.0, 8.6849E25),
    NEPTUNE("Neptune", 4_498_252_900.0, 1.0244E26); // <- finishes with ;

    // Properties
    public final String nameOfThePlanet;
    public final double avgDistanceFromSun;
    public final double mass;

    // Constructor
    Planet(String name, double distance, double mass) {
        this.nameOfThePlanet = name;
        this.avgDistanceFromSun = distance;
        this.mass = mass;
    }
}
