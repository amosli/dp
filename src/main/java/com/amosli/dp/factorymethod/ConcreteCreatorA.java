package com.amosli.dp.factorymethod;

public class ConcreteCreatorA extends Creator{

	@Override
	Product factoryMethod() {
		return new ConcreteProductA();
	}

}
