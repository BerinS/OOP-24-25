package org.example;

enum FillType {
    FILLED, NOT_FILLED
}

class Shape {
    private String color;
    private FillType filled;

    public Shape(String color, FillType filled) {
        this.color = color;
        this.filled = filled;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
    }

    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, FillType filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference with default PI: " + calculateCircumference(radius));
        System.out.println("Circumference with custom PI: " + calculateCircumference(Math.PI, radius));
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(double PI, double r) {
        return 2 * PI * r;
    }

    public double calculateCircumference(double r) {
        return 2 * Math.PI * r;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, FillType filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Shape: Rectangle");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", FillType.FILLED, 5.0);
        System.out.println("Circle Information:");
        circle.displayInfo();

        System.out.println();

        Rectangle rectangle = new Rectangle("Blue", FillType.NOT_FILLED, 4.0, 7.0);
        System.out.println("Rectangle Information:");
        rectangle.displayInfo();
    }
}
