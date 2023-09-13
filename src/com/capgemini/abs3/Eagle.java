package com.capgemini.abs3;

abstract class Eagle extends Bird{
    @Override
   abstract void eat();

    @Override
    void fly() {
        System.out.println("Eagle fly very high");
    }
}
