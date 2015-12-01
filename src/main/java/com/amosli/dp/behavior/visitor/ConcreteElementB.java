package com.amosli.dp.behavior.visitor;

public class ConcreteElementB extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

	public void methodB() {
	}

}
