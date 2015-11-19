package com.amosli.dp.build.prototype;

import java.util.List;

public class Person implements Cloneable {
	public Person clone() {
		try {
			Person p = (Person) super.clone();
			p.setClasses(classes.clone());
			return p;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	private String[] classes;

	public String[] getClasses() {
		return classes;
	}

	public void setClasses(String[] classes) {
		this.classes = classes;
	}

	private String name;
	private String addr;
	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	// @Override
	// public String toString() {
	// return "Person [name=" + name + ", addr=" + addr + ", friends=" + friends
	// + "]";
	// }
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
