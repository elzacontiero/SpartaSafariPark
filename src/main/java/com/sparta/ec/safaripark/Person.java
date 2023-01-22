package com.sparta.ec.safaripark;

public class Person implements IMovable {
    private String firstName = "";
    private String lastName = "";
    private int age;

    public Person() {

    }
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String move() {
        return getFullName() + " is moving";
    }
    @Override
    public String move(int times) {
        return getFullName() + " is moving " + times + " times";
    }
}
