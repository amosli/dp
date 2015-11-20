package com.amosli.dp.structural.decorator;

public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		Decorator decorator = new ConcreteDecoratorA();
		Decorator decoratorB = new ConcreteDecoratorB();
		decorator.setComponent(component);
		decoratorB.setComponent(decorator);
		decoratorB.operation();
	}
}
