## Java Design Pattern



## 프로토타입 패턴(Prototype Pattern)

프로토타입 패턴을 통해서 복잡한 인스턴트를 복잡할 수 있다.

생산 비용이 높은 인스턴스를 복사해서 쉽게 복사하는 패턴



> 인스턴스 생산 비용이 높은 경우란?

종류가 너무 많아서 클래스로 정리되지 않는 경우

클래스로부터 인스턴스 생성이 어려운 경우



*Shape.java*

```java
package com.PrototypePattern;

public class Shape implements Cloneable{
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // Object에 정의되어있는 함수
    // Cloneable을 명시적으로 implements해야지 불러올 수 있다.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
```



*Circle.java*

```java
package com.PrototypePattern;

public class Circle extends Shape{
    private int x, y, r;

    public Circle(int x, int y, int r) {
        super();
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public Circle copy() throws CloneNotSupportedException {
        Circle circle = (Circle) clone();
        circle.x = x+1;
        circle.y = y+1;
        return circle;
    }
}
```



*Main.java*

```java
package com.PrototypePattern;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(1,1,3);
        Circle circle2 = circle1.copy();
        System.out.println(circle1.getX()); // 1
        System.out.println(circle2.getX()); // 2 // 복붙하면 내부적으로 옆으로 이동하도록 설정
    }
}
```





> 얕은 복사

*Cat.java*

```java
package com.DeepShallow;

public class Cat {

    private String name;

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
```

*Main.java*

```java
package com.DeepShallow;

public class Main {

    public static void main(String[] args) {

        Cat navi = new Cat();
        navi.setName("navi");

        Cat yo = navi;
        System.out.println(navi.getName()); // navi
        System.out.println(yo.getName()); // navi

        yo.setName("yo");
        // 얕은 복사로 인해 같은 주소값을 가지고 있다.
        System.out.println(navi.getName()); // yo
        System.out.println(yo.getName()); // yo
    }
}
```



> 깊은 복사

*Cat.java*

```java
package com.DeepShallow;

public class Cat implements Cloneable{

    private String name;

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat ret = (Cat) this.clone();
        return ret;
    }
}
```

*Main.java*

```java
package com.DeepShallow;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Cat navi = new Cat();
        navi.setName("navi");

        Cat yo = navi.copy();
        yo.setName("yo");
        System.out.println(navi.getName()); // navi
        System.out.println(yo.getName()); // yo
    }
}
```







> Age 클래스를 줘서 더욱 다양하게 표현하려고 하는데, 깊은 복사가 이뤄지지 않은 경우

*Age.java*

```java
package com.DeepShallow;

public class Age {

    int year;
    int value;

    public Age(int year, int value) {
        super();
        this.year = year;
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }
}
```

*Cat.java*

```java
package com.DeepShallow;

public class Cat implements Cloneable{

    private String name;
    private Age age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat ret = (Cat) this.clone();
        return ret;
    }
}
```

*Main.java*

```java
package com.DeepShallow;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Cat navi = new Cat();
        navi.setName("navi");
        navi.setAge(new Age(2012, 3));

        Cat yo = navi.copy();
        yo.setName("yo");
        yo.getAge().setYear(2013);
        yo.getAge().setValue(3);

        System.out.println(navi.getName()); // navi
        System.out.println(yo.getName()); // yo

        // 깊은 복사가 이뤄지지 않는다.
        System.out.println(navi.getAge().getYear()); // 2013
        System.out.println(yo.getAge().getYear()); // 2013
    }
}
```



**그래서 명시적으로 *Cat.java*의 `copy()` 메소드를 변경해준다.**

*Main.java*

```java
public Cat copy() throws CloneNotSupportedException {
    Cat ret = (Cat) this.clone();
    // 명시적으로 깊은 복사
    ret.setAge(new Age(this.age.getYear(), this.age.getValue()));
    return ret;
}
```





