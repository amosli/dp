package com.amosli.dp.structural.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap<String, Flyweight> flys = new HashMap<String, Flyweight>();

	public FlyweightFactory() {
		flys.put("x", new ConcreteFlyweight());
		flys.put("y", new ConcreteFlyweight());
		flys.put("z", new ConcreteFlyweight());
	}

	public Flyweight getFlyweight(String key) {
		return flys.get(key);
	}
}
