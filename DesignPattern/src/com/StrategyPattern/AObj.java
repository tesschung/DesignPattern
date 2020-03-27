package com.StrategyPattern;

public class AObj {

    // 어떤 기능을 구현할때 그 책임을 다른 객체에 떠넘기는 것, 델리게이
    Ainterface ainterface;

    public AObj() {
        ainterface = new StrategyPatternCode();
    }
    public void funcAA() {

        ainterface.funcA();
        ainterface.funcA();
        // System.out.println("AAA");
        // System.out.println("AAA");

        // ~ 기능이 필요합니다. 개발해주세요.

    }
}
