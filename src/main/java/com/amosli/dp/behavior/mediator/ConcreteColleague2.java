package com.amosli.dp.behavior.mediator;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	public void send(String msg) {
		mediator.sendMsg(msg, this);
	}

	public void notify(String msg) {
		System.out.println("colleague2 get msg:" + msg);
	}
}
