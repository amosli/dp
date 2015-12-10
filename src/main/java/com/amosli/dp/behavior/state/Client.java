package com.amosli.dp.behavior.state;

public class Client {
	public static void main(String[] args) {
		Context context = new Context(new ConcreteState1());
		context.request();
		context.request();
		context.request();
		context.request();
	}
}
