package org.bootcamp;

public class Rectangle {

    final double length;
    final double breadth;
    public Rectangle(double length, double breadth) throws RectangleException {

        validateParameters(length, breadth);
        this.breadth = breadth;
        this.length = length;
    }

    public double area(){
        return length * breadth;
    }

    public void validateParameters(double length, double breadth) throws RectangleException{
        if(length < 0 || breadth < 0) throw new RectangleException("Rectangle parameter should not be negative");
    }
    public double perimeter() {
        return 2*(length+breadth);
    }
}
