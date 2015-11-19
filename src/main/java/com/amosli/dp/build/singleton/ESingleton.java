package com.amosli.dp.build.singleton;

/**
 * 饿汉式
 * 
 * @author amosli
 *
 */
public class ESingleton {
	private static final ESingleton instance = new ESingleton();

	private ESingleton() {
	}

	public static ESingleton getInstance() {
		return instance;
	}
}
