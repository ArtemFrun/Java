package com.company;

public class Circle {

    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getBaseArea()
    {
        return Math.PI*(this.getRadius()*this.getRadius());
    }

    public int getDiameter()
    {
        return this.getRadius()*2;
    }

    public double getPerimeter() { return 2*Math.PI*this.getRadius(); }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
