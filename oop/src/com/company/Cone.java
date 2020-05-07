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

import java.util.Objects;

public class Cone {
    private int radius;
    private int height;


    public Cone() {
          }

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cone cone = (Cone) o;
        return getRadius() == cone.getRadius() &&
                getHeight() == cone.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), getHeight());
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
