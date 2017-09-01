package com;

public class ScaleSquare implements Command {
	private Integer multiple;
	private WorkOnIt chef;

	public ScaleSquare(Integer side, WorkOnIt chef) {
		this.multiple = side;
		this.chef = chef;
	}

	@Override
	public void execute() throws CommandException {
		chef.scaleSqure(multiple);
		return ;
	}

	@Override
	public boolean undo() {
		chef.unDoScale();
		return false;
	}

}
