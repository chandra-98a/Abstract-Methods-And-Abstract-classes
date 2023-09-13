package com.capgemini.abs3;

public class Crow extends Bird{
    @Override
    void fly() {
        System.out.println("cow fly at medium speed");
    }

    @Override
    void eat() {
        System.out.println("crow eats flesh");
    }
}
