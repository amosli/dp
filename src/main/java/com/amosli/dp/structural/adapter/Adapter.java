package com.amosli.dp.structural.adapter;

/**
 * 适配器
 * 
 * @author amosli
 *
 */
public class Adapter implements Target {

	private Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		adaptee.specialRequest();
	}

}
