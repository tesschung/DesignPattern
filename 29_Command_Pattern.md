# Java Design Pattern



# 커맨드 패턴 (Command Pattern)



명령의 객체화

커맨드 패턴을 통해 명령을 객체화한다.

실행될 기능을 **캡슐화**함으로써 주어진 여러 기능을 실행할 수 있는 **재사용성이 높은 클래스를 설계**하는 패턴

```
일련의 행동을 특정 리시버하고 연결시킴으로써 요구 사항을 캡슐화한 것이라는 점을 이미 배웠습니다. 이렇게 하기 위해서 행동과 리시버를 한 객체에 집어넣고, execute()라는 메소드 하나만 외부에 공개하는 방법을 씁니다. 이 메소드 호출에 의해서 리시버에서 일련의 작업이 처리됩니다. 외부에서 볼 때는 어떤 객체가 리시버 역할을 하는지, 그 리시버에서 실제로 어떤 일을 하는지 알 수 없습니다. 그냥 execute() 메소드를 호출하면 요구 사항이 처리된다는 것만 알 수 있을 뿐이죠.
```



:star: command `interface` 구현

```java
package com.CommandPattern;

public interface Command {

	void execute();
}

```



```java
package com.CommandPattern;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("hi");
		
		List<Command> list = new LinkedList<Command>();
		list.add(new Command() {
			
			@Override
			public void execute() {
				System.out.println("작업1");
				
			}
		});
		
		list.add(new Command() {
			
			@Override
			public void execute() {
				System.out.println("작업2");
				
			}
		});
		
		list.add(new Command() {
			
			@Override
			public void execute() {
				System.out.println("작업3");
				
			}
		});
		
		for (Command command : list) {
			command.execute();
		}
		
	}
}

```

