package com.amosli.dp.simplefactory;

public class SimpleFactory {
	
	public static IProduct getProduct(String name){
		switch (name) {
		case "A":
			return new ProductA();
		case "B":
			return new ProductB();
		default:
			break;
		}
		return null;
	}
}
