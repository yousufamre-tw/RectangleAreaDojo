package org.example;

public class Rectangle {

    final double length;
    final double breadth;
    public Rectangle(double length, double breadth) throws RectangleException {

        validateParameters(length, breadth);
        this.breadth = breadth;
        this.length = length;
    }

    public double calculateArea(){
        return length * breadth;
    }

    public void validateParameters(double length, double breadth) throws RectangleException{
        if(length < 0) throw new RectangleException("Length should not be negative");

        if(breadth < 0) throw new RectangleException("Breadth should not be negative");
    }
    public double perimeter() {
        return 2*(length+breadth);
    }
}
