package com.AbstractFactoryPattern;

import com.AbstractFactoryPattern.Sam.SamFactory;
import com.AbstractFactoryPattern.abst.BikeFactory;
import com.AbstractFactoryPattern.abst.Body;
import com.AbstractFactoryPattern.abst.Wheel;
import com.AbstractFactoryPattern.gt.GtBikeFactory;

public class Main {

    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();
//        BikeFactory factory = new GtBikeFactory();

        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());




    }

}
