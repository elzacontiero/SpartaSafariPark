package com.sparta.ec.safaripark;

public class Giraffe extends Animal {

    public Giraffe(double weight, String colour, int age) {
        super(weight, colour, age);
    }

    @Override
    public String sleep() {
        return "Giraffe " + super.sleep();
    }

    @Override
    public String eat(IEdible food) {
        return "Giraffe " + super.eat(food);
    }

    @Override
    public String drink(IDrinkable drink) {
        return "Giraffe " + super.drink(drink);
    }

    @Override
    public String toString() {
        return "Giraffe " + super.toString();
    }

}
