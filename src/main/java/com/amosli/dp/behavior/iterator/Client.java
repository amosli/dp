package com.amosli.dp.behavior.iterator;

public class Client {
	public static void main(String[] args) {
		ConcreteAggregate aggregate = new ConcreteAggregate();
		for (int i = 0; i < 10; i++) {
			aggregate.add("i" + i);
		}
		ConcreteIterator iterator = new ConcreteIterator(aggregate);

		System.out.println(aggregate.size());
		System.out.println("first:" + iterator.first());
		System.out.println("last:" + iterator.last());
		System.out.println("current:" + iterator.last());

		while (!iterator.isDone()) {
			System.out.println(iterator.next());
		}

		System.out.println("over");
	}
}
