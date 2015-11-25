package com.amosli.dp.structural.facade;

public class Facade {
	SubsystemOne one;
	SubsystemTwo two;
	SubsystemThree three;

	public Facade() {
		one = new SubsystemOne();
		two = new SubsystemTwo();
		three = new SubsystemThree();
	}

	public void methodA() {
		System.out.println("group A:");
		one.operation1();
		two.operation2();
	}

	public void methodB() {
		System.out.println("group B:");
		three.operation3();
	}
}
