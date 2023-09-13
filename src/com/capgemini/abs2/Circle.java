package com.capgemini.abs2;

import java.util.Scanner;

public class Circle extends Shape{
    float r;
    void input(){

        System.out.println("enter a radius for circle");
        Scanner scan=new Scanner(System.in);
       r= scan.nextFloat();

    }
    void calArea(){
        area=3.14*r;
    }
}
