package com.company;

public class Box {

    private int length;
    private int Width;
    private int height;

    public Box() {
    }

    public Box(int length, int width, int height) {
        this.length = length;
        Width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume()
    {
        return  this.getHeight()*this.getLength()*this.getWidth();
    }

    public int getSurfaceArea()
    {
        return 0;
    }

    public int getDiagonal()
    {
        return 0;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", Width=" + Width +
                ", height=" + height +
                '}';
    }
}
