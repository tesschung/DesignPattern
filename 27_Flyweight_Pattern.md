# Java Design Pattern





# 플라이 웨이트 패턴  (Flyweight Pattern)



메모리 공간을 절약하기 위함

메모리를 가볍게 유지 시키기



자주 사용하는 객체를 매번 생성하지 않고 재사용하기 위해 pool에 저장했다가 꺼내 사용하는 패턴



Flywieght



FlywieghtFactory



Client





```java
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
```



```java
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

```



```java
package com.FlyweightPattern;

public class FlyWeight {
	
	public FlyWeight(String data) {
		this.data = data;
	}
	
	private String data;
	
	public String getData() {
		return data;
	}
	
}
```

