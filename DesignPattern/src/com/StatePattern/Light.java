package com.StatePattern;

public class Light {

    private State state; // 인터페이스의 객체를 생성

    public Light() {
        state = new OFF(); // 처음에는 off 상태이다.
    }

    public void setState(State state) {
        this.state = state;
    }

    public void on_button_pushed() {
        state.on_button_pushed(this); // 자기자신(this)를 넣는다.
    }

    public void off_button_pushed() {
        state.off_button_pushed(this); // 자기자신(this)를 넣는다.
    }

}
