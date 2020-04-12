package com.AbstractFactoryPattern.gt;

import com.AbstractFactoryPattern.abst.BikeFactory;
import com.AbstractFactoryPattern.abst.Body;
import com.AbstractFactoryPattern.abst.Wheel;

// 실제 팩토리 클래스
public class GtBikeFactory implements BikeFactory {
    // Abstract Factory인 BikeFactory의 클래스를 오버라이드하여
    // 제품을 생성한다.
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
