package com.amosli.dp.build.factorymethod;

public class Client {
	public static void main(String[] args) {
		Creator creator = new ConcreteCreatorA();
		Product product = creator.factoryMethod();
		product.show();
	}
}
