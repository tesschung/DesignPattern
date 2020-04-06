package com.PrototypePattern;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(1,1,3);
        Circle circle2 = circle1.copy();
        System.out.println(circle1.getX()); // 1
        System.out.println(circle2.getX()); // 2 // 복붙하면 내부적으로 옆으로 이동하도록 설정
    }
}
