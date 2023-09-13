package com.capgemini.abs3;

public class BirdApp {
    public static void main(String[] args){
        Crow c=new Crow();
        SerpentEagle se=new SerpentEagle();
        GoldenEagle ge=new GoldenEagle();
        Sky s=new Sky();
        Sparrow sp=new Sparrow();
        s.allowSky(sp);
        s.allowSky(se);
        s.allowSky(ge);
        s.allowSky(c);
    }
}
