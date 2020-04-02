package com.FactoryMethodPattern.jw;

public abstract class Creator {


    public Item create(String itemName){

        // step1: 데이터 베이스에서 아이템을 호출
        init(itemName);
        // step2: 바탕으로 아이템을 생성
        Item item = createItem(itemName);
        // step3: 생성 로그를 찍는 함수
        end(itemName);

        return item;

    }

    abstract protected String end(String itemName);
    abstract protected String init(String itemName);
    // 아이템을 생성하는 알고리즘
    abstract protected Item createItem(String itemName);

}
