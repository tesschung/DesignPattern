package com.AggredationRelation;

public class Computer {
    private MainBoard mb;
    private CPU cpu;
    private Memory memory;
    private PowerSupply powerSupply;

    public Computer(MainBoard mb, CPU cpu, Memory memory, PowerSupply powerSupply) {
        this.mb = mb;
        this.cpu = cpu;
        this.memory = memory;
        this.powerSupply = powerSupply;
    }
}
