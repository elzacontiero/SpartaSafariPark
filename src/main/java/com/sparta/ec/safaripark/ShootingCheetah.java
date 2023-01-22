package com.sparta.ec.safaripark;

public class ShootingCheetah implements IActivity {

    @Override
    public int getCaloriesRequired() {
        return 400;
    }

    @Override
    public int getFunPoints() {
        return 8;
    }

    @Override
    public String toString() {
        return "ShootingCheetah activity.";
    }
}
