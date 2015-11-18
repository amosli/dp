package com.amosli.dp.build.abstractfactory;

public class Client {
	public static void main(String[] args) {
		AbstractFactory factory = new Factory1();
		AbstractProductA productA = factory.createProductA();
		productA.show();
		AbstractProductB productB = factory.createProductB();
		productB.display();
	}
}
