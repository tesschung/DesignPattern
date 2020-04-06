package com.DeepShallow;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Cat navi = new Cat();
        navi.setName("navi");
        navi.setAge(new Age(2012, 3));

        Cat yo = navi.copy();
        yo.setName("yo");
        yo.getAge().setYear(2013);
        yo.getAge().setValue(3);

        System.out.println(navi.getName()); // navi
        System.out.println(yo.getName()); // yo

        // 깊은 복사가 이뤄지지 않는다. -> 변경후 깊은 복사를 구현
        System.out.println(navi.getAge().getYear()); // 2012
        System.out.println(yo.getAge().getYear()); // 2013
    }
}
