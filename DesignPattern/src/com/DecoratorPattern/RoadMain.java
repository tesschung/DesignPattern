package com.DecoratorPattern;

public class RoadMain {

    public static void main(String[] args) {
        Display roadWithLaneAndTraffic = new LaneDecorator(new TrafficDecorator(new RoadDisplay()));
        System.out.println(roadWithLaneAndTraffic);
        roadWithLaneAndTraffic.draw();
    }
}
