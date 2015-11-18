package com.amosli.dp.build.simplefactory;

public class Client {
	public static void main(String[] args) {
		IProduct product = SimpleFactory.getProduct("A");
		product = SimpleFactory.getProductByClassName("com.amosli.dp.build.simplefactory.ProductB");
		if (product != null) {
			product.show();
		}
	}
}
