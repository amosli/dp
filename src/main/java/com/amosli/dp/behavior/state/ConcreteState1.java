package com.amosli.dp.behavior.state;

public class ConcreteState1 extends State {

	@Override
	public void handle(Context context) {
		System.out.println("this is state1");
		context.setState(new ConcreteState2());
	}


}
