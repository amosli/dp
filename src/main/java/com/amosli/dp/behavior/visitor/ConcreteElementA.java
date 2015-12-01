package com.amosli.dp.behavior.visitor;

public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

	public void methodA() {
	}

}
