package com.BuilderPattern02;

public class ComputerBuilder {

    private Computer computer;

    private ComputerBuilder() {
        computer = new Computer("Default", "Default","Default");
    }

    public static ComputerBuilder start() {
        return new ComputerBuilder();
    }

    public ComputerBuilder setCpu(String string) {
        computer.setCpu(string);
        return this;
    }

    public ComputerBuilder setRam(String string) {
        computer.setRam(string);
        return this;
    }

    public Computer build() {
        return this.computer;
    }

}
