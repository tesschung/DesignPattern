## Java Design Pattern




## 어댑터 패턴 (Adapter Pattern)
> 연관성 없는 두 객체 묶어 사용하기

한 클래스의 인터페이스를 사용하고자 하는 *다른 인터페이스로 변환할 때* 주로 사용하며, 이를 이용하면 인터페이스 호환성이 맞지 않아 같이 쓸 수 없는 클래스를 연관 관계로 연결해서 사용할 수 있게하는 패턴



*어댑터 패턴의 장점*

관계가 없는 인터페이스 간 같이 사용 가능

프로그램 검사 용이

클래스 재활용성 증가



수의 두 배의 수를 반환: twiceOf(Float):Float

수의 반(1/2)의 수를 반환: halfOf(Float):Float

구현객체명 'Adapter'

*Math.java* 두 배와 절반을 구하는 함수는 이미 구현되어있는 상태

```java
public class Math {
    //두배
    public static double twoTime(double num){return num*2;}
    //절반
    public static double half(double num){
        return num/2;
    }
    //강화된 알고리즘
    public static Double doubled(Double d){return d*2;}
}
```



*Adapter.java*

```java
public interface Adapter {
    // 원하는 기능
    public Double twiceOf(Float num);
    public Double halfOf(Float num);
}
```



*AdapterImpl.java*

```java
public class AdapterImpl implements Adapter {
    // Adapter interface의 추상 메서드를 Override
    @Override
    public Double twiceOf(Float num) {
        // Math클래스의 doubled메소드에 Float num을 .doubleValue()을 사용,
        // Double 타입으로 바꿔 파라미터로 넘겨준다.
        // 그리고 Double바뀌어 *2로 반환된 값을 Application(호출한 클래스)에
        // 반환한다.
        return Math.doubled(num.doubleValue());
    }

    @Override
    public Double halfOf(Float num) {
        System.out.println("절반 함수 호출");
        return Math.half(num);
    }
}
```



*Application.java*

```java
public class Application {
    public static void main(String[] args) {
        //요구사항을 수행하는 인스턴스
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100.0f));
        System.out.println(adapter.halfOf(100.3f));
    }
}
```



> number.xxxValue() 

byte byteValue()

Short shortValue()

int intValue()

long longValue()

float floatValue()

double doubleValue()



---

> 다른 예제

***FormatAdapter.java***

```java
package adapter;

// MediaPlayer 인터페이스를 implements하는 FormatAdapter
public class FormatAdapter implements MediaPlayer {

   private MediaPackage media;
   
   public FormatAdapter(MediaPackage m) {
      media = m;
   }
   
   @Override
   public void play(String filename) {
      System.out.print("Using Adapter --> ");
      media.playFile(filename);
   }

}
```

```
package adapter;

public class Main {
   public static void main(String[] args) {
      
      MediaPlayer player = new MP3();
       player.play("file.mp3");
       
       player = new FormatAdapter(new MP4());
       player.play("file.mp4");
       
       player = new FormatAdapter(new MKV());
       player.play("file.mkv");
      
   }
}
```

```java
package adapter;

public interface MediaPackage {
   
   void playFile(String filename);
   
}
```

```java
package adapter;

public interface MediaPlayer {
   
   void play(String filename);
   
}
```

```java
package adapter;

public class MKV implements MediaPackage{
   
   @Override
   public void playFile(String filename) {
      System.out.println("Playing MKV File " + filename);
   }
}
```

```java
package adapter;

public class MP3 implements MediaPlayer{
   
   @Override
   public void play(String filename) {
      System.out.println("Playing MP3 File " + filename);
   }
}
```

```java
package adapter;

public class MP4 implements MediaPackage{
   
   @Override
   public void playFile(String filename) {
      System.out.println("Playing MP4 File " + filename);
   }
}
```