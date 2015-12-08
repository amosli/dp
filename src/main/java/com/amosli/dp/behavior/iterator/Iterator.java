package com.amosli.dp.behavior.iterator;

public abstract class Iterator {
	public abstract Object first();

	public abstract Object last();

	public abstract Object next();

	public abstract Boolean isDone();

	public abstract Object currentItem();
}
