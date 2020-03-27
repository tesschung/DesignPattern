## Java Design Pattern



# 스트래티지 패턴 (Strategy Pattern)

여러 알고리즘을 하나의 *추상적인 접근점*을 만들어 접근점에서 서로 *교환 가능*하도록 하는 패턴

즉, `interface`를 만들고 교환 가능하도록 하는 패턴



> 인터페이스

두 객체간을 연결해주는 접점

**기능에 대한 *선언과 구현 분리***

**기능의*사용 통로***



*Ainterface.java*

```java
package com.StrategyPattern;

public interface Ainterface {
    // 1) 기능에 대한 선언
    public void funcA();

}
```

*AinterfaceImp.java*

```java
package com.StrategyPattern;

// 2) 기능을 구현하는 클래스를 만들어서 구현(implements)
public class AinterfaceImp implements Ainterface{
    @Override
    public void funcA() {
        System.out.println("AAA");
    }
}
```

*Main.java*

```java
package com.StrategyPattern;
public class Main {
    public static void main(String[] args) {
        Ainterface ainterface = new AinterfaceImp();
        // 3) ainterface는 기능 사용할 수 있는 통로가 된다.
        ainterface.funcA();

    }
}
```




> 델리게이트

*위임*하다

**특정 객체의 기능을 수행하기 위해 다른 객체의 기능을 호출하는 것**



*AObj.java*

```java
package com.StrategyPattern;

public class AObj {

    // 어떤 기능을 구현할때 그 책임을 다른 객체에 떠넘기는 것, 델리게이
    Ainterface ainterface;

    public AObj() {
        ainterface = new StrategyPatternCode();
    }
    public void funcAA() {

        ainterface.funcA();
        ainterface.funcA();
        // System.out.println("AAA");
        // System.out.println("AAA");

        // ~ 기능이 필요합니다. 개발해주세요.

    }
}
```



*Main.java*

```java
package com.StrategyPattern;

public class Main {
    public static void main(String[] args) {

        Ainterface ainterface = new StrategyPatternCode();
       
        ainterface.funcA();

      	// 델리게이트한 기능 사용 
        AObj aObj = new AObj();
        aObj.funcAA();

    }
}
```



> 스트레티지 패턴 예제

신작 게임에서 캐릭터와 무기를 구현해보자. 무기는 칼과 검이 있다. 칼과 검이 가지는 공통 interface에 추상메소드를 작성한다.

*Weapon.java*

```java
package com.StrategyPattern;

public interface Weapon {
    // 무기의 접점
    public void attack();
}
```

그리고 Weapon interface를 implements하는 칼과 검을 작성한다. ㅇ이때 각 클래스에 맞게 추상메소드를 Override한다.

*Knife.java*

```java
package com.StrategyPattern;

public class Knife implements Weapon{
    @Override
    public void attack() {
        System.out.println("knife attack");
    }
}
```

*Sword.java*

```java
package com.StrategyPattern;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("Sword attack");
    }
}
```

Weapon 객체를 받는 캐릭터를 작성한다. 

*GameCharacter.java*

```java
package com.StrategyPattern;

public class GameCharacter {

    // 접근점
    private Weapon weapon;

    // 교환가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            System.out.println("맨손 공격");
        } else {
            // 델리게이트
            weapon.attack();
        }
    }
}
```

*Main.java*

```java
package com.StrategyPattern;

public class Main {
    public static void main(String[] args) {

        GameCharacter character = new GameCharacter();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();
    }
}
```

