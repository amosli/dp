package com.amosli.dp.behavior.strategy;

public class Client {
	public static void main(String[] args) {
		Context context  = new Context(new ConcreteStrategyA());
		context.ContextInterface();
	}
}
