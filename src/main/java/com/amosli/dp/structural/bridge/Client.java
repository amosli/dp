package com.amosli.dp.structural.bridge;

public class Client {
	public static void main(String[] args) {
		Abstraction abstraction = new RefinedAbstraction();
		abstraction.operation(new ConcreteImplementorA());
	}
}
