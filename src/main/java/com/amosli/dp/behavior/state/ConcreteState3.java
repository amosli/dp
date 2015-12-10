package com.amosli.dp.behavior.state;

public class ConcreteState3 extends State {

	@Override
	public void handle(Context context) {
		System.out.println("this is state3");
		context.setState(new ConcreteState1());
	}

}
