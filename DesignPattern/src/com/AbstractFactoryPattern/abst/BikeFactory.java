package com.AbstractFactoryPattern.abst;

// 실제 팩토리의 공통 인터페이스
public interface BikeFactory {

    public Body createBody(); // body를 return하는 함수
    public Wheel createWheel(); //

}
