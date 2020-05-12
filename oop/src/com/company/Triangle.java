package com.company;

public class Triangle {

    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle() {
    }

    public Triangle(float sideA, float sideB, float sideC) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
    }

    public Triangle(float sideA, float sideB, double alpha) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = (float)Math.sqrt(sideA*sideA + sideB*sideB - 2*sideA*sideB*Math.cos(alpha));
    }

}
