package com.BuilderPattern;

// BluePrint를 상속 받는다.
public class LgGramBlueprint extends BluePrint{

    private Computer computer;

    public LgGramBlueprint() {
        this.computer = new Computer("default","default","default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("8g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256g ssd");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
