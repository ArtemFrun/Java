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

public class Cone extends Circle implements IInfo{
    private int height;


    public Cone() {
          }

    public Cone(int radius, int height) {
        super(radius);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + super.toString() +
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getConeForming()
    {
        return Math.sqrt((super.getRadius()*super.getRadius())+(this.getHeight()*this.getHeight()));
    }

    public double getSurfaceArea()
    {
        return Math.PI*super.getRadius()*this.getConeForming();
    }

    public double getArea()
    {
        return this.getBaseArea()+this.getSurfaceArea();
    }

    public double getVolume()
    {
        return ((Math.PI*(super.getRadius()*super.getRadius())*this.getHeight())/3);
    }

    @Override
    public String toXML() {
        return "<Cone>" +
                "<radius>" + this.getRadius() + "</radius>" +
                "<height>" + this.getHeight() + "</height>" +
                "</Cone>";
    }

    @Override
    public String toJson() {
        return "{" + "\"Cone\":" +
                "{" + "\"radius\":" + this.getRadius() +
                "\"height\":" + this.getHeight() + "}"
                + "}";
    }
}
