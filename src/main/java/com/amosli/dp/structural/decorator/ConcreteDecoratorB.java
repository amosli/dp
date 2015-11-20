package com.amosli.dp.structural.decorator;

public class ConcreteDecoratorB extends Decorator {

	@Override
	public void operation() {
		super.operation();
		addBehavior();
	}
	
	public void addBehavior(){
		System.out.println("add behavior");
	}
}
