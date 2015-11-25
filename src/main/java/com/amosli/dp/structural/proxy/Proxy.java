package com.amosli.dp.structural.proxy;

public class Proxy extends Subject {
	private Subject subject;

	public Proxy() {
		subject = new RealSubject();
	}

	@Override
	void request() {
		subject.request();
	}

}
