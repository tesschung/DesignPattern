package com.ChainofResponsibility;

public abstract class Calculator {

    private Calculator nextCalculator;

    public void setNextCalculator(Calculator nextCalculator) {
        this.nextCalculator = nextCalculator;
    }

    public boolean process(Request request) {
        if (operator(request)) {
            //
            return true;
        } else {
            if (nextCalculator != null) {
                return nextCalculator.process(request);
            }
            return false;
        }
    }

    abstract protected boolean operator(Request request);
}
