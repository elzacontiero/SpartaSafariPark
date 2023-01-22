package com.sparta.ec.safaripark;

public class Gorilla extends Animal {
    public Gorilla(double weight, String colour, int age) {
        super(weight, colour, age);
    }

    @Override
    public String sleep() {
        return "Gorilla " + super.sleep(); // "is sleeping..."
    }

    @Override
    public String eat(IEdible food) {
        return "Gorilla " + super.eat(food);
    }

    @Override
    public String drink(IDrinkable drink) {
        return "Gorilla " + super.drink(drink);
    }

    @Override
    public String toString() {
        return "Gorilla " + super.toString();
    }
}
