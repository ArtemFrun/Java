package com.company;

public class TriangleFactory {

    private float sideA;
    private float sideB;
    private float sideC;

    public TriangleFactory() {
    }

    private TriangleFactory(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static Triangle create(float a, float b, float c)
    {
        if( a + b < c || a + c < b || b + c < a)
            return null;
        return  new Triangle(a,b,c);
    }

}
