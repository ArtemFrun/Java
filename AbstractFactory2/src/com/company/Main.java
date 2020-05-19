package com.company;

public class Main {

    public static void main(String[] args) {
	    IGeometry triangle = AbstractFactory.create(3,5,ShapeType.TRIANGLE);
	    IGeometry rectangle = AbstractFactory.create(5,3, ShapeType.RECTANGLE);
	    IGeometry rhombus = AbstractFactory.create(1,3,ShapeType.RHOMBUS);

        System.out.println(triangle);
        System.out.println(rectangle);
        System.out.println(rhombus);
    }
}
