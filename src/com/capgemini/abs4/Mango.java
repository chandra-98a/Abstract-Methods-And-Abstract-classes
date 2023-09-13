package com.capgemini.abs4;

import java.util.Scanner;

public class Mango extends Fruit{
    int quantity;
    @Override
    void color() {
        System.out.println("Colour of the Mango is RipeYellow");
    }



    @Override
    void taste() {
        System.out.println("Mango's taste is sweet and little chisel");
    }


    void quantity() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the quantity of mango");
        quantity=scan.nextInt();
    }

    @Override
    void findCostInKg() {
        cost=70*quantity;
    }
}
