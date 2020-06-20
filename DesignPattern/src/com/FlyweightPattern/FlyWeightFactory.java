package com.FlyweightPattern;

import java.util.Map;
import java.util.TreeMap;

public class FlyWeightFactory {

	Map<String, FlyWeight> pool;
	
	public FlyWeightFactory() {
		pool = new TreeMap<>();
	}
	
	public FlyWeight getFlyWeight(String key) {
		FlyWeight flyWeight = pool.get(key);
		
		if (flyWeight == null) {
			flyWeight = new FlyWeight(key);
			
			pool.put(key, flyWeight);
			// pool에 없었다면 계속해서 새로 생성 했을 것
			System.out.println("새로생성 " + key);
		} else {
			System.out.println("재사용 " + key);
		}
		
		return flyWeight;
	}
}
