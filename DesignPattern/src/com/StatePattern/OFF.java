package com.StatePattern;

public class OFF implements State{
    // 싱글턴 패턴 사용
    private static OFF off = new OFF();
    OFF(){}

    public static OFF getInstance() {
        return off;
    }
    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light ON");
        light.setState(ON.getInstance()); // 싱글턴 패턴 사용
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("반응 없음");
    }
}
