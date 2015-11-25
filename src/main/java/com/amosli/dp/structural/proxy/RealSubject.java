package com.amosli.dp.structural.proxy;

public class RealSubject extends Subject{

	@Override
	void request() {
		System.out.println("this is realsubject...");
	}

}
