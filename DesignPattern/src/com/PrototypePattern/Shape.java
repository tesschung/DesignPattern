package com.PrototypePattern;

public class Shape implements Cloneable{
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // Object에 정의되어있는 함수
    // Cloneable을 명시적으로 implements해야지 불러올 수 있다.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
