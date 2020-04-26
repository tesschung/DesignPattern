package com.CompositionRelation;

public class Computer {
    private MainBoard mb;
    private CPU cpu;
    private Memory memory;
    private PowerSupply powerSupply;

    public Computer() {
        this.mb = new MainBoard();
        this.cpu = new CPU();
        this.memory = new Memory();
        this.powerSupply = new PowerSupply();
    }
}
