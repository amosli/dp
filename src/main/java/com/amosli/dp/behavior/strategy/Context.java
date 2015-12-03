package com.amosli.dp.behavior.strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void ContextInterface() {
		strategy.algorithmInterface();
	}

}
