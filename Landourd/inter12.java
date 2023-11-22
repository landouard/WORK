public class inter12 {
    public static void main(String[] args) {
       
        Circle myCircle = new Circle(5);
        Rectangle myRectangle = new Rectangle(4, 6);

    
        System.out.println("Circle Area: " + myCircle.calculateArea());
        System.out.println("Circle Perimeter: " + myCircle.calculatePerimeter());

        System.out.println("Rectangle Area: " + myRectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + myRectangle.calculatePerimeter());
    }
}

interface Shape {
    double calculateArea();  
    double calculatePerimeter();  
}


class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Class representing a Rectangle
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing interface methods
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

