package com.sparta.ec.Shapes;

public class Rectangle extends Shape {
   private double width;

   private double height;

   public Rectangle(double width, double height){
   this.width = width;
   this.height = height;
   }

    @Override
    public double calculateArea(){
        return width*height;
 }

 }

//create a Circle class which extends Shape
// This should go into its own file, ok?

//override getArea

//

//create an appropriate constructor
//

//area = 0.5 * Math.Pi * radius * radius