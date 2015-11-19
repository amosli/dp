package com.amosli.dp.build.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		ConcretePrototype concretePrototype = new ConcretePrototype();
		for (int i = 0; i < 5; i++) {
			ConcretePrototype clone = (ConcretePrototype) concretePrototype.clone();
			clone.show();
		}
		
		Person p = new Person();
		p.setAddr("sh");
		p.setName("amosli");
		List<String> friends=new ArrayList<String>();
		friends.add("a");
		friends.add("b");
		friends.add("c");
		p.setFriends(friends);
		p.setClasses(new String[2]);
		Person clone = p.clone();
		System.out.println(p);
		System.out.println(clone);

		System.out.println(p.getClasses());
		System.out.println(clone.getClasses());
		
		System.out.println(clone.getFriends());
		System.out.println(p.getFriends());

	}
}
