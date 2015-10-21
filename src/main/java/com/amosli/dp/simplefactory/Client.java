package com.amosli.dp.simplefactory;

public class Client {
	public static void main(String[] args) {
		IProduct product = SimpleFactory.getProduct("A");
		product.show();
	}
}
