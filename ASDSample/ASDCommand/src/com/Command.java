package com;

public interface Command {
	public void execute() throws CommandException;
	public boolean undo();
}
