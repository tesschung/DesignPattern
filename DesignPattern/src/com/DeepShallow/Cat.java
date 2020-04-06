package com.DeepShallow;

public class Cat implements Cloneable{

    private String name;
    private Age age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat ret = (Cat) this.clone();
        // 명시적으로 깊은 복사
        ret.setAge(new Age(this.age.getYear(), this.age.getValue()));
        return ret;
    }
}
