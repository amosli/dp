package com.amosli.dp.behavior.cor;

public class ConcreteHandler3 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request>=10) {
			System.out.println("so,request>=10");
		} else if (handler != null) {
			handler.handleRequest(request);
		}
	}
}
