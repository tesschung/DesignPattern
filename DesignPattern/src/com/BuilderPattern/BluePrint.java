package com.BuilderPattern;

public abstract class BluePrint {

    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setStorage();

    public abstract Computer getComputer();
}
