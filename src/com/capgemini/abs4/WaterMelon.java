package com.capgemini.abs4;

import java.util.Scanner;

public class WaterMelon extends Fruit{
    int quantity;
    @Override
    void color() {
        System.out.println("Colour of the WaterMelon is Red inside and Green outside");
    }



    @Override
    void taste() {
        System.out.println("WaterMelon taste is sweet ");
    }


    void quantity() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the quantity of Watermelon");
        quantity=scan.nextInt();
    }

    @Override
    void findCostInKg() {
        cost=40*quantity;
    }
}
