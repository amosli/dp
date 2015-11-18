package com.amosli.dp.build.factorymethod;


public class ConcreteCreatorB extends Creator{

	@Override
	Product factoryMethod() {
		return new ConcreteProductB();
	}

}
