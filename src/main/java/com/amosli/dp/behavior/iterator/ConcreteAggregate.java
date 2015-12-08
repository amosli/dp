package com.amosli.dp.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
	private List<Object> items = new ArrayList<Object>();

	@Override
	public Iterator ConcreteIterator() {
		return new ConcreteIterator(this);
	}

	public Object get(int index) {
		return items.get(index);
	}

	public int size() {
		return items.size();
	}

	public void add(Object obj) {
		items.add(obj);
	}

}
