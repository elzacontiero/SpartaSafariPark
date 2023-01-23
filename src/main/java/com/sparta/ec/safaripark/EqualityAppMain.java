package com.sparta.ec.safaripark;

public class EqualityAppMain {
    public static void main(String[] args) {
        var bobOne = new Person("Bob", "Builder", 25);
        var bobTwo = bobOne;
        var areSame = bobOne.equals(bobTwo);

        // another object with same data, but completely separate.

        var bobThree = new Person("Bob", "Builder", 25);
        var areSameOneThree = bobOne.equals(bobThree);// same as below.
        var areSameOneThreeOperator = bobOne == bobThree;

        // without overriding equals, just taking the default, the second one (bobThree) is
        // going to be false. They're going to be in different places in memory in the heap.


    }
}
