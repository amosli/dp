package com.amosli.dp.structural.decorator;

public class ConcreteDecoratorA extends Decorator{

	private String addedStat;
	public String getAddedStat() {
		return addedStat;
	}
	public void setAddedStat(String addedStat) {
		this.addedStat = addedStat;
	}
	@Override
	public void operation() {
		super.operation();
		addedStat="addedStat";
		System.out.println("added stat..");
	}
	
}
