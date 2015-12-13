package com.amosli.dp.behavior.cor;

public class Client {
	public static void main(String[] args) {
		ConcreteHandler1 h1 = new ConcreteHandler1();
		ConcreteHandler2 h2 = new ConcreteHandler2();
		ConcreteHandler3 h3 = new ConcreteHandler3();
		
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		h1.handleRequest(20);
	}
}
