package com.amosli.dp.build.builder;

public class ConcreteBuilder extends Builder {

	private Product product = new Product();

	public Product getResult() {
		return product;
	}

	@Override
	public void buildPartA() {
		product.add("part a..");
	}

	@Override
	public void buildPartB() {
		product.add("part b..");
	}

}
