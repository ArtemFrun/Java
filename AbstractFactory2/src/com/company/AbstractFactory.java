package com.company;

public class AbstractFactory {

    private int width;
    private int length;

    public static IGeometry create(double length, double width, ShapeType type)
    {
        switch (type)
        {
            case RHOMBUS: return new Rhombus((int)length, (int)width);
            case TRIANGLE: return new Triangle((int)length, (int)width);
            case RECTANGLE: return new Rectangle((int)length, (int)width);
            default: return null;
        }
    }

}
