package workshop2;

class Shape {
 double getPerimeter() {
     return 0;
 }

 double getArea() {
     return 0;
 }
}
//Subclass
class Circle extends Shape {
 double radius;

 // Constructor
 Circle(double radius) {
     this.radius = radius;
 }

 double getPerimeter() {
     return 2 * Math.PI * radius;
 }

 @Override
 double getArea() {
     return Math.PI * radius * radius;
 }
}

public class Q2 {
	public static void main(String[] args) {
        
        Circle myCircle = new Circle(5.0);

        System.out.println("Circle Radius: " + myCircle.radius);
        System.out.println("Perimeter: " + myCircle.getPerimeter());
        System.out.println("Area: " + myCircle.getArea());
    }

}
