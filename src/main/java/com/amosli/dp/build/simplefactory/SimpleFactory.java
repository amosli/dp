package com.amosli.dp.build.simplefactory;

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
	
	public static IProduct getProductByClassName(String className){
		try {
			Class<?> cls = Class.forName(className);
			try {
				IProduct newInstance =(IProduct) cls.newInstance();
				return newInstance;
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
