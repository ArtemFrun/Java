/*
 *
 *Class ConeTest
 *
 *Create by Frunze
 *
 * 24.05.2020
 *
 *
 */

public class Cone {

    private int radius;
    private int height;

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

    public Cone() {
    }

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
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


    public double getConeForming()
    {
        return Math.sqrt((getRadius()*getRadius())+(this.getHeight()*this.getHeight()));
    }

    public double getSurfaceArea()
    {
        return Math.PI*getRadius()*this.getConeForming();
    }

    public double getArea()
    {
        return this.getBaseArea()+this.getSurfaceArea();
    }

    public double getVolume()
    {
        return ((Math.PI*(getRadius()*getRadius())*this.getHeight())/3);
    }

    public boolean isCone()
    {
        if(getRadius() != 0 && getHeight() != 0)
            return true;

        return false;
    }

}
