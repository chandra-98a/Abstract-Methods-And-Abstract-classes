package com.capgemini.abs;

public class Airport {
    void allowPlane(Plane ref){
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}
