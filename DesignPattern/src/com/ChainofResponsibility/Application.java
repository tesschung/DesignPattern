package com.ChainofResponsibility;

public class Application {

    public static void main(String[] args) {

        Calculator plus = new PlusCalculator();
        Calculator sub = new SubCalculator();

        plus.setNextCalculator(sub);

        // 처리를 할 수 있으면 처리하고 처리할 수 없으면 다음 것으로 넘어간다.
        Request request1 = new Request(1,2,"+"); // 3
        Request request2 = new Request(10,2,"-"); // 8

        plus.process(request1);
        plus.process(request2);
    }

}
