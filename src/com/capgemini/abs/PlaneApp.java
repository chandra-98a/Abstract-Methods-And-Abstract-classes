package com.capgemini.abs;

public class PlaneApp {
    public static void main(String[] args){
        Cargo c=new Cargo();
        Passenger p=new Passenger();
        Fighter f=new Fighter();
        Airport a=new Airport();

        a.allowPlane(c);
        a.allowPlane(p);
        a.allowPlane(f);

    }
}
