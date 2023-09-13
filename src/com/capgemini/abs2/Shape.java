package com.capgemini.abs2;

abstract class Shape {
    double area;
    abstract void input();
    abstract void calArea();
     void disp(){
         System.out.println("Area is "+ area);
     }

}
