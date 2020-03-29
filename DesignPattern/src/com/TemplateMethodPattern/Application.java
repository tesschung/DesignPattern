package com.TemplateMethodPattern;

public class Application {

    public static void main(String[] args) {
        AbstConnectHelper abstConnectHelper = new ConcreteConnectHelper();

        abstConnectHelper.requestConnection("아이디 암호 등 접속 정보");

    }

}
