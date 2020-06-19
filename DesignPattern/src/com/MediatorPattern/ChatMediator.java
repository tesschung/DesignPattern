package com.MediatorPattern;

public class ChatMediator extends Mediator{

	@Override
	public void mediate(String data) {
		System.out.println(data);
		for (Colleague colleague : colleagues) {
			// 중재 가능성이 있는 정보가 존재
			colleague.handle(data);
		}
	}

}
