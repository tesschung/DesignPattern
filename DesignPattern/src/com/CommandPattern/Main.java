package com.CommandPattern;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("hi");
		
		List<Command> list = new LinkedList<Command>();
		list.add(new Command() {
			
			@Override
			public void execute() {
				System.out.println("작업1");
				
			}
		});
		
		list.add(new Command() {
			
			@Override
			public void execute() {
				System.out.println("작업2");
				
			}
		});
		
		list.add(new Command() {
			
			@Override
			public void execute() {
				System.out.println("작업3");
				
			}
		});
		
		for (Command command : list) {
			command.execute();
		}
		
	}
}
