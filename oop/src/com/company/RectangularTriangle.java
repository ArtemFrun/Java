package com.company;

import java.util.Objects;

public class RectangularTriangle implements IGeometry, IInfo{

    private double cathet1;
    private double cathet2;

    public RectangularTriangle() {
    }

    public RectangularTriangle(double cathet1, double cathet2) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
    }

    public double getCathet1() {
        return cathet1;
    }

    public void setCathet1(double cathet1) {
        this.cathet1 = cathet1;
    }

    public double getCathet2() {
        return cathet2;
    }

    public void setCathet2(double cathet2) {
        this.cathet2 = cathet2;
    }

    @Override
    public String toString() {
        return "RectangularTriangle{" +
                "cathet1=" + cathet1 +
                ", cathet2=" + cathet2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangularTriangle that = (RectangularTriangle) o;
        return Double.compare(that.getCathet1(), getCathet1()) == 0 &&
                Double.compare(that.getCathet2(), getCathet2()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCathet1(), getCathet2());
    }

    public double getHypotenuse()
    {
        return Math.sqrt(this.getCathet1()*this.getCathet1() + this.getCathet2()*this.getCathet2());
    }

    @Override
    public double getPerin() {
        return this.getCathet1() + this.getCathet2() + this.getHypotenuse();
    }

    @Override
    public double fetSquare() {
        return this.getCathet1()*this.getCathet2()/2;
    }

    @Override
    public String toXML() {
        return "<RectangularTriangle>" +
                "<cathet1>" + this.getCathet1() + "</cathet1>" +
                "<cathet1>" + this.getCathet2() + "</cathet1>" +
                "</RectangularTriangle>";
    }

    @Override
    public String toJson() {
        return "{" + "\"RectangularTriangle\":" +
                "{" + "\"cathet1\":" + this.getCathet1() +
                "\"cathet2\":" + this.getCathet2() + "}"
                + "}";
    }
}
