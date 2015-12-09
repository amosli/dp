package com.amosli.dp.behavior.command;

public abstract class Command {
	protected Receiver invoker;

	public Command(Receiver invoker) {
		this.invoker = invoker;
	}

	public abstract void execute();
}
