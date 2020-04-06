package com.PrototypePattern;

public class Circle extends Shape{
    private int x, y, r;

    public Circle(int x, int y, int r) {
        super();
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public Circle copy() throws CloneNotSupportedException {
        Circle circle = (Circle) clone();
        circle.x = x+1;
        circle.y = y+1;
        return circle;
    }
}
