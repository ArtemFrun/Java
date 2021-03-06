package com.company;

import java.util.Objects;

public class Rectangle {

    private int length;
    private int widths;

    public Rectangle()
    {

    }

    public Rectangle(int length, int widths) {
        this.length = length;
        this.widths = widths;
    }

    public int getLength() {
        return length;
    }

    public int getWidths() {
        return widths;
    }

    public void setLength(int length) {
        if(length>0) {
            this.length = length;
        }
    }

    public void setWidths(int widths) {
        this.widths = widths;
    }

    public int getArea()
    {
        return this.getLength()*this.getWidths();
    }

    public static int getArea(int length, int widths)
    {
        return length*widths;
    }
    public int getPerimeter()
    {
        return 2*(this.getLength() + this.getWidths());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", widths=" + widths +
                '}';
    }

    public String toXML()
    {
        return "<Rectangle>" +
                "<length>" + this.getLength() + "</length>" +
                "<widths>" + this.getWidths() + "</widths>" +
                "</Rectangle>";
    }

    public String toJson()
    {
        return "{" + "\"Rectangle\":" +
        "{" + "\"length\":" + this.getLength() +
                "\"widths\":" + this.getWidths() + "}"
        + "}";
    }

    public String toConsole()
    {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getLength() == rectangle.getLength() &&
                getWidths() == rectangle.getWidths();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidths());
    }
}
