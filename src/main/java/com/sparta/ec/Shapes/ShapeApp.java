package com.sparta.ec.Shapes;


public class ShapeApp {
    public static void main(String[] args) {
        // Shape s = new Shape(); Error shape is abstract.

        var myRec = new Rectangle(7.2, 3.0);
        System.out.println(myRec.calculateArea());
        var circle = new Circle(2.0);
        System.out.println(circle.calculateArea());

//
//        List<Shape> myShapes = new ArrayList<>();
//        myShapes.add(myRec);
//        myShapes.add(myCircle);
//        myShapes.add(new Circle (myRec);
//        System.out.println("Demo of polymorphism");
//        for (Shape s: myShapes) {
//            System.out.println(s.calculateArea());
//       }


    }

}



// she said i had to commit to go to the version control?
// Ok, open the IntelliJ terminal and we will commit 