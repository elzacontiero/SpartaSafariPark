package com.sparta.ec.safaripark;


public abstract class Animal {
    private double weight;
    private String colour;
    private int age;


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(double weight, String colour, int age) {
        this.weight = weight;
        this.colour = colour;
        this.age = age;
    }


    // methods specific to Animal.

    public String sleep() {
        return "is sleeping...";
    }

    // Animal is eating something.
    public String eat(IEdible food) {
        return "is eating " + food.calories() + " calories.";
    }

    // Animal is drinking something.
    public String drink(IDrinkable drink) {
        return "is drinking " + drink.liquidVolume() + " ml.";
    }


    @Override
    public String toString() {
        return "Animal{" +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                ", age=" + age +

                '}';
    }
}
