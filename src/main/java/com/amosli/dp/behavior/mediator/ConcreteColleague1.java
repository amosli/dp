package com.amosli.dp.behavior.mediator;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	public void send(String msg) {
		mediator.sendMsg(msg, this);
	}

	public void notify(String msg) {
		System.out.println("colleague1 getMsg:" + msg);
	}
}
