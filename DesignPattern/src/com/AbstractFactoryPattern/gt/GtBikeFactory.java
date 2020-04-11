package com.AbstractFactoryPattern.gt;

import com.AbstractFactoryPattern.abst.BikeFactory;
import com.AbstractFactoryPattern.abst.Body;
import com.AbstractFactoryPattern.abst.Wheel;

public class GtBikeFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
