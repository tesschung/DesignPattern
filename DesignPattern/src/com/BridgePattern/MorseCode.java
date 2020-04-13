package com.BridgePattern;

public class MorseCode {

    private MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function) {
        this.function = function;
    }

    public void setFunction(MorseCodeFunction function) {
        this.function = function;
    }

    public void dot() {
        function.dot(); // 위임한다.
    }

    public void dash() {
        function.dash();
    }

    public void space() {
        function.space();
    }
}
