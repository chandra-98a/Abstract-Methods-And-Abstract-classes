package com.capgemini.abs4;

import java.util.Scanner;

public class Orange extends Fruit{
    int quantity;
    @Override
    void color() {
        System.out.println("Colour of the Orange is Saffron");
    }



    @Override
    void taste() {
        System.out.println("Orange tastes chisel");
    }


    void quantity() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the quantity of orange");
        quantity=scan.nextInt();
    }

    @Override
    void findCostInKg() {
        cost=80*quantity;
    }

}
