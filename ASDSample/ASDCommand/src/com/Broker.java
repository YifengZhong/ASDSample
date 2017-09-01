package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Broker {
	List<Command> commands = new ArrayList<Command>();
	private Stack<Command> commandsExecuted = new Stack<Command>();
	
	public void takeOrder(Command command) {
		commands.add(command);
	}
	public void placeOrder() {
		try {
			for(Command command:commands) {
				commandsExecuted.push(command);
				command.execute();
			}
		} catch (CommandException e) {
			while ( !commandsExecuted.empty() ){
					commandsExecuted.pop().undo();
				}			
		}
		
		commands.clear();
	}
}
