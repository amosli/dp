package com.amosli.dp.structural.flyweight;

public class Client {
	public static void main(String[] args) {
		int extrinsicstate=20;
		FlyweightFactory f = new FlyweightFactory();
		Flyweight xflyweight = f.getFlyweight("x");
		xflyweight.operation(--extrinsicstate);
		
		Flyweight yflyweight = f.getFlyweight("y");
		yflyweight.operation(--extrinsicstate);
	
		Flyweight zflyweight = f.getFlyweight("z");
		zflyweight.operation(--extrinsicstate);
		
		UnsharedFlyweight unsharedFlyweight = new UnsharedFlyweight();
		unsharedFlyweight.operation(--extrinsicstate);
	}
}
