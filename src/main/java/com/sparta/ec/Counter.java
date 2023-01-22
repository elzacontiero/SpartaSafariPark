package com.sparta.ec;

/*
 Example class of abstraction and encapsulation.
 Recording 2023-01-17. Objects & Classes Pt1.mp3
 */
public class Counter {

    private int count;

    public Counter() {
    }

    public Counter(int initialCount) {
        count = initialCount;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void setCount(int value) {
        count = value;
    }

    public void outputCount() {
        System.out.println(count);
    }

}





