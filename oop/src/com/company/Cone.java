package com.company;

/*
*
*Class Cone
*
*Create by Frunze
*
* 05.05.2020
*
*
*
 */

public class Cone {
    private int radius;
    private int height;

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getConeForming()
    {
        return Math.sqrt((this.getRadius()*this.getRadius())+(this.getHeight()*this.getHeight()));
    }

    public double getBaseArea()
    {
        return Math.PI*(this.getRadius()*this.getRadius());
    }

    public double getSurfaceArea()
    {
        return Math.PI*this.getRadius()*this.getConeForming();
    }

    public double getArea()
    {
        return this.getBaseArea()+this.getSurfaceArea();
    }

    public int getDiameter()
    {
        return this.getRadius()*2;
    }

    public double getVolume()
    {
        return ((Math.PI*(this.getRadius()*this.getRadius())*this.getHeight())/3);
    }
}
