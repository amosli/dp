package com.amosli.dp.structural.composite;

public class Client {
	public static void main(String[] args) {
		Component c = new Composite("root");
		c.add(new Leaf("leaf1"));
		c.add(new Leaf("leaf2"));

		Component sub = new Composite("sub1");
		sub.add(new Leaf("grand1"));
		sub.add(new Leaf("grand2"));
		
		Component sub2 = new Composite("sub2");
		sub2.add(new Leaf("grand3"));
		sub2.add(new Leaf("grand4"));
		
		c.add(sub);
		c.add(sub2);
		c.display(1);

	}
}
