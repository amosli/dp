package com.amosli.dp.behavior.memento;

public class Client {
	public static void main(String[] args) {
		
		Originator originator = new Originator();
		originator.setState("start");
		originator.show();
		Memento memento = originator.createMemento();
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(memento);

		originator.setState("over");
		originator.show();	
		originator.setMemento(caretaker.getMemento());
		originator.show();
	}
}
