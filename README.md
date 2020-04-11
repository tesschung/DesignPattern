:star:

어댑터패턴 팩토리패턴 싱글톤 빌더 컴포짓 데코레이터 옵저버 프록시



# DesignPattern


## 생성 패턴(Creational Pattern)

[팩토리 메소드 (Factory Method Pattern)](https://github.com/tesschung/DesignPattern/blob/master/12_Factory_Method_Pattern.md)

객체 생성을 서브 클래스에서 처리하도록 분리하고 캡슐화한 패턴이다.

상위 클래스에서 인터페이스만 정의하고 실제 생성을 서브 클래스가 담당한다.



[싱글톤 패턴 (Singleton Pattern)](https://github.com/tesschung/DesignPattern/blob/master/13_Singleton_Pattern.md)

하나의 객체를 생성하면 생성된 객체를 어디서든 참조할 수 있지만, 여러 프로세스가 동시에 참조할 수는 없다.

클래스 내에서 인스턴스가 하나뿐임을 보장하며, 불필요한 메모리 낭비를 최소화 할 수 있다.



[프로토 타입 패턴 (Prototype Pattern)](https://github.com/tesschung/DesignPattern/blob/master/14_Prototype_Pattern.md)

원본 객체를 복제하는 방법으로 객체를 생성하는 패턴이다.

상위 클래스에서 인터페이스만 정의하고 실제 생성은 서브클래스가 담당한다.



[빌더 패턴 (Builder Pattern)](https://github.com/tesschung/DesignPattern/blob/master/15_Builder_Pattern.md)

작게 분리된 인스턴스를 건축하듯이 조합하여 객체를 생성한다.

객체의 생성 과정과 표현 방법을 분리하고 있어, 동일한 객체 생성에서도 서로 다른 결과를 만들어 낼 수 있다.



[추상 팩토리 패턴 (Abstract Factory Pattern)]()






## 구조 패턴(Structural Pattern)

[어댑터 패턴 (Adapter Pattern)](https://github.com/tesschung/DesignPattern/blob/master/10_Adapter_Pattern.md)

호환성 없는 클래스등의 인터페이스를 다른 클래스가 이용할 수 있도록 변환해주는 패턴이다.

기존의 클래스를 이용하고 싶지만 인터페이스가 일치하지 않을때 이용한다.



[브릿지 패턴]()

구현부에서 추상층을 분리하여, 서로가 독립적으로 확장할 수 있도록 구성한 패턴이다.

기능과 구현을 두 개의 별도 클래스로 구현한다.



[컴포짓 패턴]()

여러 객체를 가진 복합 객체와 단일 객체를 구분없이 다루고자할때 사용하는 패턴이다.

객체들을 트리구조로 구성하여 디렉터리 안에 디렉터리가 있듯이 복합 객체 안에 복합 객체가 포함되는 구조를 구현할 수 있다.



[데코레이터 패턴]()

객체 간의 결합을 통해 능동적으로 기능들을 확장할 수 있는 패턴이다.

임의의 객체에 부가적인 기능을 추가하기 위해 다른 객체들을 덧붙이는 방식으로 구현한다.



[퍼사드 패턴]()

복잡한 서브 클래스들을 피해 더 상위에 인터페이스를 구성함으로써 서브 클래스들의 기능을 간편하게 사용할 수 있도록 하는 패턴이다.

서브 클래스들 사이의 통합 인터페이스를 제공하는 wrapper 객체가 필요하다.



[플라이웨이트 패턴]()

인스턴스가 필요할 때마다 매번 생성하는 것이 아니고 가능한 한 공유해서 사용함으로써 메모리 절약하는 패턴이다.

다수의 유사 객체를 생성하거나 조작할 때 유용하게 사용할 수 있다.



[프록시 패턴]()

접근이 어려운 객체와 여기에 연결하려는 객체 사이에서 인터페이스 역할을 수행하는 패턴이다.

네트워크 연결, 메모리의 대용량 객체로의 접근 등에 주로 이용한다.



## 행위 패턴(Behavioral Pattern)

[스트래티지 패턴 (Strategy Pattern)](https://github.com/tesschung/DesignPattern/blob/master/09_Strategy_Pattern.md)

상위 클래스에서 골격을 정의하고, 하위 클래스에서 세부 처리를 구체화하는 구조의 패턴이다.

유사한 서브 클래스를 묶어 공통된 내용을 상위 클래스에서 정의함으로써 코드의 양을 줄이고 유지보수를 용이하게 해준다.



[책임사슬 패턴]()

요청을 처리할 수 있는 객체가 둘 이상 존재하여 한 객체가 처리하지 못하면 다음 객체로 넘어가는 형태의 패턴이다.

요청을 처리할 수 있는 각 객체들이 고리로 묶여있어 요청이 해결 될 때까지 고리를 따라 책임이 넘어간다.



[템플릿 메소드 패턴 (Template Method Pattern)](https://github.com/tesschung/DesignPattern/blob/master/11_Template_Method_Pattern.md)

상위 클래스에서 골격을 정의하고, 하위 클래스에서 세부 처리를 구체화하는 구조의 패턴이다.

유사한 서브 클래스를 묶어 공통된 내용을 상위 클래스에서 정의함으로써 코드의 양을 줄이고 유지보수를 용이하게 해준다.



[비지터 패턴]()

각 클래스등의 데이터 구조에서 처리 기능을 분리하여 별도의 클래스로 구성하는 패턴이다.

분리된 처리 기능은 각 클래스를 방문하여 수행한다.



[옵서버 패턴]()

한 객체의 상태가 변화하면 객체에 상속되어있는 다른 객체들에게 변화된 상태를 전달하는 패턴이다.

주로 분산된 시스템 간에 이벤트를 생성 및 발행하고, 이를 수신해야 할 때 이용한다.



[중재자 패턴]()

수많은 객체들 간의 복잡한 상호작용을 캡슐화하여 객체로 정의하는 패턴이다.

객체 사이의 의존성을 줄여 결합도를 감소시킬 수 있다.



[상태 패턴]()

객체의 상태에 따라 동일한 동작을 다르게 처리해야 할 때 사용하는 패턴이다.

객체 상태를 캡슐화하고 이를 참조하는 방식으로 처리한다.



[메멘토 패턴]()

특정 시점에서의 객체 내부 상태를 객체화함으로써 이후 요청에 따라 객체를 해당 시점의 상태로 되돌릴 수 있는 기능을 제공하는 패턴이다.



[커멘드 패턴]()

요청을 객체의 형태로 캡슐화하여 재이용하거나 취소할 수 있도록 요청에 필요한 정보를 저장하거나 로그에 남기는 패턴이다.

요청에 사용되는 각종 명령어들을 추상클래스와 구체클래스로 분리하여 단순화한다.

