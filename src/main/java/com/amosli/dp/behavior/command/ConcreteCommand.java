package com.amosli.dp.behavior.command;

public class ConcreteCommand extends Command {

	public ConcreteCommand(Receiver invoker) {
		super(invoker);
	}

	@Override
	public void execute() {
		invoker.action();
	}

}
