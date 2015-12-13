package com.amosli.dp.behavior.cor;

public abstract class Handler {
	protected Handler handler;

	public void setSuccessor(Handler handler) {
		this.handler = handler;
	}

	public abstract void handleRequest(int request);
}
