package com.amosli.dp.structural.flyweight;

public class UnsharedFlyweight extends Flyweight {

	@Override
	void operation(int extrinsicstate) {
		System.out.println("this is unshared part:" + extrinsicstate);
	}

}
