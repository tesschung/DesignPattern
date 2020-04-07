package com.BuilderPattern;

public class ComputerFactory {

    private BluePrint print;

    public void setBlueprint(BluePrint print) {
        // 설계도를 가진다.
        this.print = print;
    }

    public void make() {
        // 설계도를 바탕으로 만든다.
        print.setRam();
        print.setCpu();
        print.setStorage();
    }


    public Computer getComputer() {
        return print.getComputer();
    }
}
