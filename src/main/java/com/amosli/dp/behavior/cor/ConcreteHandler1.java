package com.amosli.dp.behavior.cor;

public class ConcreteHandler1 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request < 0) {
			System.out.println("request is null");
		} else if (handler != null) {
			handler.handleRequest(request);
		}
	}

}
