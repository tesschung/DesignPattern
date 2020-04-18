package com.DecoratorPattern;

public class TrafficDecorator extends DisplayDecorator {


    public TrafficDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }
    
    public void draw() {
        super.draw();
        drawTraffic();
    }
    
    public void drawTraffic() {
        System.out.println("교통량 그리기");
    }
}
