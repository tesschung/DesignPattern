package com.BridgePattern;

public class SoundMorseCodeFunction implements MorseCodeFunction{
    @Override
    public void dot() {
        System.out.print("Dot");
    }

    @Override
    public void dash() {
        System.out.print("Dash");
    }

    @Override
    public void space() {
        System.out.print("~");
    }
}
