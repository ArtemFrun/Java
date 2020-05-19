package com.company;

public class Rhombus implements IGeometry{
    private  int length;
    private int height;

    public Rhombus(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}
