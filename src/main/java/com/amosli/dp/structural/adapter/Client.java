package com.amosli.dp.structural.adapter;
/**
 * 客户端
 * 
 * @author amosli
 *
 */
public class Client {
	public static void main(String[] args) {
		Target adapter = new Adapter();
		adapter.request();
	}
}
