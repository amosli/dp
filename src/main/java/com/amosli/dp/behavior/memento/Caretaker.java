package com.amosli.dp.behavior.memento;
/**
 * 管理者
 * @author amosli
 *
 */
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
