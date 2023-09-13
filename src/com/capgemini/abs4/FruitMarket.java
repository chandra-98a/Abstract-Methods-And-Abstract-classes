package com.capgemini.abs4;

public class FruitMarket {
    public static void main(String[] args){
        Mango m=new Mango();
        Market ma=new Market();
        Orange o=new Orange();
        WaterMelon wm=new WaterMelon();

        ma.allowFruits(m);
        ma.allowFruits(o);
        ma.allowFruits(wm);
    }
}
