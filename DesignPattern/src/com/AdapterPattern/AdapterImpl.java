package com.AdapterPattern;

public class AdapterImpl implements Adapter {
    // Adapter interface의 추상 메서드를 Override
    @Override
    public Double twiceOf(Float num) {
        // Math클래스의 doubled메소드에 Float num을 doubleValue()를 사용해서
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
