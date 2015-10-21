package com.amosli.dp.factorymethod;

public class Client {
	public static void main(String[] args) {
		Creator creator = new ConcreteCreatorA();
		Product product = creator.factoryMethod();
		product.show();
	}
}
