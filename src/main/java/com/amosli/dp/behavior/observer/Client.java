package com.amosli.dp.behavior.observer;

public class Client {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		subject.attach(new ConcreteObserver(subject,"xa"));
		subject.attach(new ConcreteObserver(subject,"xb"));
		subject.attach(new ConcreteObserver(subject,"xc"));
		subject.setSubjectState("amosli又更新了设计模式系列文章哦！");
		subject.notifyObserver();
	}
}
