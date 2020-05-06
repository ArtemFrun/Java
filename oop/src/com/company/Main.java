package com.company;

//построить клас к геометрической фигуре и придумать 5 методов к классу

public class Main {

    public static void main(String[] args) {

        int length = 7;
        int widths = 8;
        int area = length*widths;
        System.out.println(area);

        //-  oop   ------

        Rectangle myGarden = new Rectangle(length, widths);
        myGarden.setLength(10);

        System.out.println(myGarden);
        System.out.println(myGarden.getArea());

        Rectangle hisGarden = new Rectangle();
        hisGarden.setLength(12);
        hisGarden.setWidths(5);

        hisGarden.equals(myGarden);
        System.out.println(hisGarden.hashCode());
        System.out.println(hisGarden.getPerimeter());
        //-   cone -----
        int radius = 5;
        int height = 8;

        Cone myCone = new Cone(5,8);
        System.out.println(myCone.getConeForming());
        System.out.println(myCone.getArea());
        System.out.println(myCone.getSurfaceArea());
        System.out.println(myCone.getBaseArea());
        System.out.println(myCone.getDiameter());
        System.out.println(myCone.getVolume());
    }
}
