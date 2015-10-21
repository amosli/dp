package com.amosli.dp.factorymethod;

public class ConcreteCreatorB extends Creator{

	@Override
	Product factoryMethod() {
		return new ConcreteProductB();
	}

}
