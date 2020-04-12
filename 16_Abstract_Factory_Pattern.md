## Java Design Pattern

> [참고사이트](https://gmlwjd9405.github.io/2018/08/08/abstract-factory-pattern.html)

## 추상 팩토리 패턴(Abstract Factory Pattern)

관련있는 객체의 생성을 가상화한다.

생성 부분의 가상화/ 관련있는 객체



가상화된 프로덕트를 가지고 활용한다고 생각하면 된다.



> 흐름

:one: 추상팩토리는 추상제품들을 만드는 메소드를 가지고 있다.

:two: 추상팩토리는 실제팩토리에 상속되어 `추상제품들을 만드는 메소드`가 실제팩토리에 오버라이드 된다.

:three: *오버라이드*된 실제팩토리의 `추상제품들을 만드는 메소드`에서는 return 값으로 실제제품을 반환한다.







