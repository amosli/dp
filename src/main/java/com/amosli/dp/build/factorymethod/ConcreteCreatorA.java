package com.amosli.dp.build.factorymethod;

public class ConcreteCreatorA extends Creator{

	@Override
	Product factoryMethod() {
		return new ConcreteProductA();
	}

}
