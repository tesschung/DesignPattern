## Java Design Pattern



## 브릿지 패턴 (Bridge Pattern)

기능 계층과 구현 계층의 분리

어댑터패턴과 흡사하다



모스부호를 구현하면서 알아보자.

*MorseCode.java*

```java
package com.BridgePattern;

public class MorseCode {

    private MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function) {
        this.function = function;
    }

    public void setFunction(MorseCodeFunction function) {
        this.function = function;
    }

    public void dot() {
        function.dot(); // 위임한다.
    }

    public void dash() {
        function.dash();
    }

    public void space() {
        function.space();
    }
}
```



*MorseCodeFunction.java*

> 기능 부분

```java
package com.BridgePattern;

public interface MorseCodeFunction {
    public void dot();
    public void dash();
    public void space();
}
```



*PrintMorseCode.java*

```java
package com.BridgePattern;

public class PrintMorseCode extends MorseCode{

    public PrintMorseCode(MorseCodeFunction function) {
        super(function);
    }

    //    garam
    public void g(){
        dash();dash();dot();space();
    }
    public void a(){
        dot();dash();space();
    }
    public void r(){
        dot();dash();dot();space();
    }
    public void m(){
        dash();dash();space();
    }
}
```



*SoundMorseCodeFunction.java*

```java
package com.BridgePattern;

public class SoundMorseCodeFunction implements MorseCodeFunction{
    @Override
    public void dot() {
        System.out.print("Dot");
    }

    @Override
    public void dash() {
        System.out.print("Dash");
    }

    @Override
    public void space() {
        System.out.print("~");
    }
}
```



*DefaultMorseCodeFunction.java*

```java
package com.BridgePattern;

public class DefaultMorseCodeFunction implements MorseCodeFunction{
    @Override
    public void dot() {
        System.out.print("●");
    }

    @Override
    public void dash() {
        System.out.print("-");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
```



*Main.java*

```java
package com.BridgePattern;

public class Main {
    public static void main(String[] args) {
        PrintMorseCode code = new PrintMorseCode(new SoundMorseCodeFunction());
        PrintMorseCode code = new PrintMorseCode(new DefaultMorseCodeFunction());
        code.a();code.g();code.r();code.m();
    }
}
```