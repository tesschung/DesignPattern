## Java Design Pattern





## 싱글톤 패턴 (Singleton Pattern)

>  ***하나의 인스턴스만 있도록 하기***



객체란?

객체: 속성과 기능을 갖춘 것

클래스: 속성과 기능을 정의한 것, 

인스턴스: 속성과 기능을 가진 것중 실제한 것



개발중인 시스템에서 **스피커에 접근할 수 있는 클래스**를 만들어보자.

스피커에 접근할 수 있는 클래스가 하나 이상이면, 소리를 올릴때 모든 클래스를 찾아가서 올려야 하므로 비용이 발생한다. 이런 경우에서는 싱글톤 패턴으로 개발해야 한다.



*SystemSpeaker.java*

```java
package com.SingletonPattern;

public class SystemSpeaker {

    // 하나만 하기 위해서 static
    static private SystemSpeaker instance;
    private int volume;

    // 외부에서 생성 함수를 사용하지 못하도록 private
    private SystemSpeaker() {
        volume = 5;
    }

    public static SystemSpeaker getInstance() {
        // null 인지 아닌지 체크
        if (instance == null) {
            // 시스템 스피커
            instance = new SystemSpeaker();
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
```

*Main.java*

```java
package com.SingletonPattern;

public class Main {

    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();
        System.out.println(speaker1.getVolume()); // 5
        System.out.println(speaker2.getVolume()); // 5

        speaker1.setVolume(11);
        System.out.println(speaker1.getVolume()); // 11
        System.out.println(speaker2.getVolume()); // 11
        // 같은 결과가 출력되어 동일한 인스턴스임을 확인할 수 있다.
    }
}
```