package com.sparta.ec.enums;
// Enums exist on their own.

public class Enum {

    public enum DayIndex {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        DayIndex dayOfWeek;
        dayOfWeek = DayIndex.THURSDAY;

        if (dayOfWeek == DayIndex.SATURDAY || dayOfWeek == DayIndex.SUNDAY) {
            System.out.println("It is the weekend.");

        } else{
            System.out.println("It is a weekday.");
        }

        PizzaSize chosenSize = PizzaSize.SMALL;
        System.out.println("Size: " + chosenSize.getPizzaSize());
        System.out.println("Calories: " + chosenSize.getPizzaCalories());
        System.out.println("Energy: " + chosenSize.getEnergyInJoules());


        System.out.println();

    }
}
