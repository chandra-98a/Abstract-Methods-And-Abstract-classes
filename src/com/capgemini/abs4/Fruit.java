package com.capgemini.abs4;

abstract class Fruit {
    abstract void taste();
    abstract void color();
    abstract void quantity();
    int cost;

    abstract  void findCostInKg();
    void displayCost(){
        System.out.println("cost "+ cost);
    }
}
