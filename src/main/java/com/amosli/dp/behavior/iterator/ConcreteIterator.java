package com.amosli.dp.behavior.iterator;

public class ConcreteIterator extends Iterator {
	private ConcreteAggregate concreteAggregate;

	public ConcreteIterator(ConcreteAggregate concreteAggregate) {
		this.concreteAggregate = concreteAggregate;
	}

	private int count=0;

	@Override
	public Object first() {
		return concreteAggregate.get(0);
	}

	@Override
	public Object last() {
		return concreteAggregate.get(concreteAggregate.size() - 1);
	}

	@Override
	public Object next() {
		return concreteAggregate.get(count++);
	}

	@Override
	public Object currentItem() {
		return concreteAggregate.get(count);
	}

	@Override
	public Boolean isDone() {
		return count >= concreteAggregate.size();
	}

}
