package com.amosli.dp.behavior.cor;

public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 0 && request < 10) {
			System.out.println("so,0<=request<10");
		} else if (handler != null) {
			handler.handleRequest(request);
		}
	}
}
