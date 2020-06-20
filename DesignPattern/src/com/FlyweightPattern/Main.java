package com.FlyweightPattern;

public class Main {
	public static void main(String[] args) {
		FlyWeightFactory factory = new FlyWeightFactory();
		FlyWeight flyWeight = factory.getFlyWeight("a");
		System.out.println(flyWeight);
		flyWeight = factory.getFlyWeight("a");
		System.out.println(flyWeight);
	}

}
