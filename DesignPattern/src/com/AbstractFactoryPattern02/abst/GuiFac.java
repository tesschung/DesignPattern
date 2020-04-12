package com.AbstractFactoryPattern02.abst;

public interface GuiFac {
    // 추상팩토리에서는 다른 곳에서도 접근이 가능하도록 public을 해주어야한다.
    public Button createButton();
    public TextArea createTextArea();
}
