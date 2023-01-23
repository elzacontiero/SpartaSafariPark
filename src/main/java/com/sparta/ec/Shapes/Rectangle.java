package com.sparta.ec.Shapes;

public class Rectangle extends Shape {
   private double width;

   private double height;

   public Rectangle(double width, double height){
   this.width = width;
   this.height = height;
   }

   @Override
   public double calculateArea() {
        return width*height;
   }

   @Override

   public boolean equals(Object o){
      if (this == o) return true;
      if( o== null || getClass() != o.getClass()) return false;
      Rectangle rectangle = (Rectangle) o;
      return Double.compare(rectangle.width,width)== 0 && Double.compare(rectangle.height, height) == 0;

   }

   @Override
   public String toString() {
      return "Rectangle{" +
              "width=" + width +
              ", height=" + height +
              '}';
   }
}

