package com.amosli.dp.behavior.memento;
/**
 * 备忘录
 * @author amosli
 *
 */
public class Memento {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento(String state) {
		this.state = state;
	}

}
