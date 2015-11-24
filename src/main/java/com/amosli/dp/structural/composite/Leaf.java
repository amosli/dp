package com.amosli.dp.structural.composite;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("this is leaf,cannot be added!");
	}

	@Override
	public void remove(Component c) {
		System.out.println("this is leaf,cannot be removed!");
	}

	@Override
	public void display(int depth) {
		System.out.println(Util.concat("-", depth).concat(name));
	}

}
