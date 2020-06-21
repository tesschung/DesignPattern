package com.ProxyPattern;

public class Proxy implements Subject{
	
	private Subject real;
	
	public Proxy(Subject real) {
		this.real = real;
	}
	
	@Override
	public void action1() {
		// 간단한 업무는 proxy가 한다.
		System.out.println("간단한 업무 by proxy");
	}

	@Override
	public void action2() {
		this.real.action2();
	}

	
}
