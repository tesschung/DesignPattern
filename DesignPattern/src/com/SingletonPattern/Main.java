package com.SingletonPattern;

public class Main {

    public static void main(String[] args) {
        SystemSpeak speaker1 = SystemSpeak.getInstance();
        SystemSpeak speaker2 = SystemSpeak.getInstance();
        System.out.println(speaker1.getVolume()); // 5
        System.out.println(speaker2.getVolume()); // 5

        speaker1.setVolume(11);
        System.out.println(speaker1.getVolume()); // 11
        System.out.println(speaker2.getVolume()); // 11
        // 같은 결과가 출력되어 동일한 인스턴스임을 확인할 수 있다.
    }
}
