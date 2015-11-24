package com.amosli.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	public Composite(String name) {
		super(name);
	}

	private List<Component> components= new ArrayList<Component>();
	@Override
	public void add(Component c) {
		components.add(c);
	}

	@Override
	public void remove(Component c) {
		components.remove(c);
	}

	@Override
	public void display(int depth) {
		System.out.println(Util.concat("-", depth++).concat(name));
		for (Component component : components) {
			component.display(depth+1);
		}
	}

}
