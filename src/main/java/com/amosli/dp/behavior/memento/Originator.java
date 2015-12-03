package com.amosli.dp.behavior.memento;
/**
 * 发起人
 * @author amosli
 *
 */
public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public void setMemento(Memento memento) {
		state = memento.getState();
	}

	public Memento createMemento() {
		return new Memento(state);
	}
	public void show(){
		System.out.println(state);
	}
}
