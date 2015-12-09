package com.amosli.dp.behavior.command;

public class Client {
	public static void main(String[] args) {
		Invoker manager = new Invoker();
		Command command = new ConcreteCommand(new Receiver());
		
		manager.add(command);
		manager.inform();
	}
}
