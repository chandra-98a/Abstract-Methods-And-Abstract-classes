package com.capgemini.abs2;

public class ShapeApp {
    public static void main(String[] args){
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        Geometry g=new Geometry();
        Square s=new Square();

        g.allowShape(s);
        g.allowShape(r);
        g.allowShape(c);
    }
}
