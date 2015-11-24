package com.amosli.dp.structural.composite;

public class Util {

	public static String concat(String str, int num) {
		StringBuilder sb  = new StringBuilder();
		for(int i=0;i<num;i++){
			sb.append(str);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(concat("-", 3));
	}
}
