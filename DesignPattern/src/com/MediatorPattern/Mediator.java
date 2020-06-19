package com.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
	
	protected List<Colleague> colleagues; // colleague의 리스트를 가지고 있어야 중재할 대상을 얻는다.
	
	public Mediator() {
		colleagues = new ArrayList<Colleague>();
	}
	
	public boolean addColleague(Colleague colleague) {
		
		if (colleagues != null) {
			return colleagues.add(colleague); // return true
		} else {
			return false;
		}
		
	}
	
	
	public abstract void mediate(String data);
	
}
