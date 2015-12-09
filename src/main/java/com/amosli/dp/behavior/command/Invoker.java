package com.amosli.dp.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	private List<Command> commands = new ArrayList<Command>();
	
	public void add(Command command){
		commands.add(command);
	}
	
	public void remove(Command command){
		commands.remove(command);
	}
	
	public void inform(){
		for (Command command : commands) {
			command.execute();
		}
	}
	
}
