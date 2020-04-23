package com.StatePattern;

public class ON implements State{
    // 싱글턴 패턴 사용
    private static ON on = new ON();
    private ON(){}

    public static ON getInstance() {
        return on;
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("반응 없음");
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light OFF");
        light.setState(OFF.getInstance()); // 싱글턴 패턴 사용
    }
}
