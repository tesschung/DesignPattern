package com.MediatorPattern;

public abstract class Colleague {
	
	private Mediator mediator; // 어떤 mediator에 속했는가
	
	public boolean join(Mediator mediator) {
		
		if (mediator == null) { // null 이라면 false return
			return false;
		}
		else {
			this.mediator = mediator;
			return mediator.addColleague(this);
		}
	}
	
	public void sendData(String data) {
		if(mediator != null) {
			mediator.mediate(data);
		}
	}
	
	abstract public void handle(String data);
	
	
	
}
