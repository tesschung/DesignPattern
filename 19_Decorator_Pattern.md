## Java Design Pattern



## 데코레이터 패턴 (Decorator Pattern)

> 기본 기능에 추가할 수 있는 기능의 종류가 많은 경우에
>
> 각 추가 기능을 Decorator 클래스로 정의한 후
>
> 필요한 Decorator 객체를 조합함으로써 추가 기능을 설계하는 방식이다.



실시간으로 기능을 추가할 수 있는 패턴이다.



Display.java

```java
package com.DecoratorPattern;

public abstract class Display {
    public void draw() {}
}
```



RoadDisplay.java

```java
package com.DecoratorPattern;

public class RoadDisplay extends Display{
    
    public void draw() {
        System.out.println("기본 도로");
    }
}
```



DisplayDecorator.java

```java
package com.DecoratorPattern;

public class DisplayDecorator extends Display {

    private Display decoratedDisplay;

    public DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }

    public void draw() {
        decoratedDisplay.draw();
    }
}
```



LaneDecorator.java

```java
package com.DecoratorPattern;

public class LaneDecorator extends DisplayDecorator{

    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    public void draw() {
        super.draw();
        drawLane();
    }

    public void drawLane() {
        System.out.println("차선 그리기");
    }
}
```



TrafficDecorator.java

```java
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
```



RoadMain.java

```java
package com.DecoratorPattern;

public class RoadMain {

    public static void main(String[] args) {
        Display roadWithLaneAndTraffic = new LaneDecorator(new TrafficDecorator(new RoadDisplay()));
        System.out.println(roadWithLaneAndTraffic);
        roadWithLaneAndTraffic.draw();
    }
}

/*
기본 도로
교통량 그리기
차선 그리기
*/
```

