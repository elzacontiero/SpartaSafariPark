package com.sparta.ec.safaripark;

public class Hunter extends Person {

    private String camera = "";
     public Hunter() {}

    public Hunter(String firstName, String lastName, int age, String camera) {
        super(firstName, lastName, age);
        this.camera = camera;

    }

    public String shoot() {
         return getFullName() + " has taken a photo with their " + camera;
    }

    @Override
    public String toString() {
         return super.toString() + " Hunter{ camera='" + camera + '\'' + '}';
         // However, this string might give the reader the impression that we're talking
        // about two objects: Person and Hunter, whereas they are a single object.
    }

//    @Override
//    public String toString() {
//        return "Hunter" +
//                "{" + "camera='" + camera + '\'' + " name=" + getFullName() + " age="+  getAge() +'}';
//    }
}
