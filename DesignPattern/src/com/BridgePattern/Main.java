package com.BridgePattern;

public class Main {
    public static void main(String[] args) {
        PrintMorseCode code = new PrintMorseCode(new SoundMorseCodeFunction());
        code.a();code.g();code.r();code.m();
    }
}
