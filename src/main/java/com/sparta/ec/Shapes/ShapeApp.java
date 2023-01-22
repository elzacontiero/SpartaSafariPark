package com.sparta.ec.Shapes;


import java.util.ArrayList;
import java.util.List;

public class ShapeApp {
    public static void main(String[] args) {
        var myRec = new Rectangle(3.2, 3.0);
        System.out.println(myRec.calculateArea());
        var circle = new Circle(5.0);
        System.out.println(circle.calculateArea());

        List<Shape> myShapes = new ArrayList<>();

        myShapes.add(myRec);
        myShapes.add(circle);
        myShapes.add(new Circle(4.0));
        System.out.println("Demo of polymorphism");

        for (Shape s : myShapes) {
            System.out.println(s.calculateArea());
        }
    }
}



// she said i had to commit to go to the version control?
// Ok, open the IntelliJ terminal and we will commit 