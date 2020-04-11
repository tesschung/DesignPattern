package com.AbstractFactoryPattern.Sam;

import com.AbstractFactoryPattern.abst.BikeFactory;
import com.AbstractFactoryPattern.abst.Body;
import com.AbstractFactoryPattern.abst.Wheel;

public class SamFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
