package com.FacadePattern;

public class Facade {

    private HelpSystem01 helpSystem01;
    private HelpSystem02 helpSystem02;

    public Facade() {
        helpSystem01 = new HelpSystem01();
        helpSystem02 = new HelpSystem02();
    }

    public void process() {
        helpSystem01.process();
        helpSystem02.process();
    }

}
