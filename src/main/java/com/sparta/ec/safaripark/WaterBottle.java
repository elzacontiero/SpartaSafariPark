package com.sparta.ec.safaripark;

public class WaterBottle implements IDrinkable {

    int volume;

    // Returning the amount of water.
    @Override
    public int liquidVolume() {
        return volume;
    }


    // Constructor takes volume of water
    public WaterBottle(int volume) {
        this.volume = volume;
    }
}
