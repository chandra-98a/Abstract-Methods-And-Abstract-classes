package com.capgemini.abs2;

import java.util.Scanner;

public class Square extends Shape{
    float l;
    void input(){

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a length of square");
        l=scan.nextFloat();
    }
    void calArea(){
        area= l*l;
    }
}
