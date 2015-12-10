package com.amosli.dp.behavior.state;

public class ConcreteState2 extends State {

	@Override
	public void handle(Context context) {
		System.out.println("this is state2");
		context.setState(new ConcreteState3());
	}

}
