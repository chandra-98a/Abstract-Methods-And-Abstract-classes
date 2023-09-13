package com.capgemini.abs2;

import java.util.Scanner;

public class Rectangle extends Shape{
    float l,b;
    void input(){

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a length of rectangle");
        l=scan.nextFloat();
        System.out.println("enter a breadth of rectangle");
        b=scan.nextFloat();
    }
    void calArea(){
        area= l*b;
    }
}
