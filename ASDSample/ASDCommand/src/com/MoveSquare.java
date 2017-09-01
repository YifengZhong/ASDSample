package com;

public class MoveSquare implements Command {
	private Integer offset;
	private WorkOnIt chef;

	public MoveSquare(Integer side, WorkOnIt chef) {
		this.offset = side;
		this.chef = chef;
	}

	@Override
	public void execute() throws CommandException {
		chef.moveSqure(offset);
		return ;
	}

	@Override
	public boolean undo() {
		chef.unDoMoveSqure();
		return false;
	}

}
