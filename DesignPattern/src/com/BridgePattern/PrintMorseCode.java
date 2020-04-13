package com.BridgePattern;

public class PrintMorseCode extends MorseCode{

    public PrintMorseCode(MorseCodeFunction function) {
        super(function);
    }

    //    garam
    public void g(){
        dash();dash();dot();space();
    }
    public void a(){
        dot();dash();space();
    }
    public void r(){
        dot();dash();dot();space();
    }
    public void m(){
        dash();dash();space();
    }
}
