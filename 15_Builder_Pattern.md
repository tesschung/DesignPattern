## Java Design Pattern

*빌더 패턴은 책에서 설명된 패턴과 실무에서 쓰이는 패턴이 차이가 있다고 한다.



## 빌더 패턴(Builder Pattern)

> **복잡한 단계**가 있는 인스턴스 생성과정 **단순화**



빌더란? 우리가 어떤 객체를 원할때, 빌더한테 넘겨서 구현한다. 즉, ***복잡한 단계***를 거쳐야 생성되는 객체의 구현을 ***서브클래스***에게 넘겨주는 패턴



*책에서 나오는 빌더패턴*

---



*BluePrint.java*

```java
package com.BuilderPattern;

public abstract class BluePrint {

    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setStorage();
    
    public abstract Computer getComputer();
}
```



*Computer.java*

```java
package com.BuilderPattern;

public class Computer {

    private String cpu;
    private String ram;
    private String storage;


    public Computer(String cpu, String ram, String storage) {
        super();
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
  
    public String getStorage() {
        return storage;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRam() {
        return ram;
    }

    @Override
    public String toString(){
        return cpu+" "+ram+" "+storage;
    }
}
```



*ComputerFactory.java*

```java
package com.BuilderPattern;

public class ComputerFactory {

    private BluePrint print;

    public void setBlueprint(BluePrint print) {
        // 설계도를 가진다.
        this.print = print;
    }

    public void make() {
        // 설계도를 바탕으로 만든다.
        print.setRam();
        print.setCpu();
        print.setStorage();
    }


    public Computer getComputer() {
        return print.getComputer();
    }
}
```



*LgGramBlueprint.java*

*개별 모델이 맞는 클래스를 선언을 위해, Blueprint 추상클래스를 상속받는다.

```java
package com.BuilderPattern;

// BluePrint를 상속 받는다.
public class LgGramBlueprint extends BluePrint{

    private Computer computer;

    public LgGramBlueprint() {
        this.computer = new Computer("default","default","default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("8g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256g ssd");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
```



*Main.java*

```java
package com.BuilderPattern;

public class Main {
    public static void main(String[] args) {

        ComputerFactory factory = new ComputerFactory();

        factory.setBlueprint(new LgGramBlueprint());

        factory.make();

        Computer computer = factory.getComputer();

        System.out.println(computer.toString());
    }
}
```





*실무에서 쓰는 빌더패턴*

---

> 체이닝 방식으로 객체의 필드 값을 변경해준다.



```java
package com.BuilderPattern02;

public class Computer {

    private String cpu;
    private String ram;
    private String storage;

    public Computer(String cpu, String ram, String storage) {
        super();
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getStorage() {
        return storage;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRam() {
        return ram;
    }

    @Override
    public String toString(){
        return cpu+" "+ram+" "+storage;
    }

}
```



```java
package com.BuilderPattern02;

public class ComputerBuilder {

    private Computer computer;

    private ComputerBuilder() {
        computer = new Computer("Default", "Default","Default");
    }

    public static ComputerBuilder start() {
        return new ComputerBuilder();
    }

    public ComputerBuilder setCpu(String string) {
        computer.setCpu(string);
        return this;
    }

    public ComputerBuilder setRam(String string) {
        computer.setRam(string);
        return this;
    }
  
  	public ComputerBuilder setStorage(String string) {
        computer.setStorage(string);
        return this;
    }

    public Computer build() {
        return this.computer;
    }
    
}
```



```java
package com.BuilderPattern02;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        // 아래처럼 했을때 변수 순서를 이상하게 넣으면 큰 오류가 나는걸 방지하기 위해서
        // 체이닝 방식으로 생성
//        Computer computer = new Computer("", "", "");

        Computer computer = ComputerBuilder
                .start()
                .setCpu("i7")
                .setRam("8g")
                .build();

        System.out.println(computer.toString()); // i7 8g Default
    }
}
```

