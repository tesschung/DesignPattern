package com.BuilderPattern02;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        // 아래처럼 했을때 변수 순서를 이상하게 넣으면 큰 오류가 나는걸 방지하기 위해서
        // 체이닝 형식으로 생성
//        Computer computer = new Computer("", "", "");

        Computer computer = ComputerBuilder
                .start()
                .setCpu("i7")
                .setRam("8g")
                .build();

        System.out.println(computer.toString()); // i7 8g Default
    }
}
