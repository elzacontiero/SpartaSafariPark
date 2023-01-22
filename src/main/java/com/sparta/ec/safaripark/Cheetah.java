package com.sparta.ec.safaripark;

public class Cheetah extends Animal {

    public Cheetah(double weight, String colour, int age) {
        super(weight, colour, age);
    }

    @Override
    public String sleep() {
        return "Cheetah " + super.sleep();
    }

    @Override
    public String eat(IEdible food) {
        return "Cheetah " + super.eat(food);
    }

    @Override
    public String drink(IDrinkable drink) {
        return "Cheetah " + super.drink(drink);
    }

    @Override
    public String toString() {
        return "Cheetah " + super.toString();
    }
}
