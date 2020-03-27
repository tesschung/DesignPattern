package com.AdapterPattern;

public class Application {
    public static void main(String[] args) {
        //요구사항을 수행하는 인스턴스
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100.0f));
        System.out.println(adapter.halfOf(100.3f));
    }
}
