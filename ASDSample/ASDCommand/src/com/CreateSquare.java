package com;

public class CreateSquare implements Command {
	
	private Integer side;
	private WorkOnIt chef;

	public CreateSquare(Integer side, WorkOnIt chef) {
		this.side = side;
		this.chef = chef;
	}

	@Override
	public void execute() throws CommandException {
		chef.createSqure(side);
		return;
	}

	@Override
	public boolean undo() {
		chef.unDoCreateSquare();
		return false;
	}

}
