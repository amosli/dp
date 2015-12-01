package com.amosli.dp.behavior.visitor;

/**
 * VISITOR PATTERN
 * 
 * @author amosli
 *
 */
public class Client {
	public static void main(String[] args) {
		ObjectStructure obj = new ObjectStructure();
		obj.attach(new ConcreteElementA());
		obj.attach(new ConcreteElementB());

		obj.accept(new ConcreteVisitorA());
		obj.accept(new ConcreteVisitorB());

	}
}
