package com;

import java.util.ArrayList;
import java.util.List;

public class WorkOnIt {
	private Character[][] result;
	private Integer side = 0;
	private Integer multiple = 0;
	public void createSqure(Integer side) throws CommandException {
		this.side = side;
		result = new Character[side][side];
		for(int i = 0; i< side; i++) {
			for(int j = 0; j < side; j++) {
				result[i][j] = '.';
			}
		}
		if (side == 4) throw new CommandException();
		return;
	}
	public void scaleSqure(Integer multiple) throws CommandException {
		this.side = this.side * multiple;
		this.multiple = multiple;
		createSqure(this.side);
		if (multiple == 5) throw new CommandException();
	}
	public void moveSqure(Integer offset) throws CommandException {
		if (offset >= 100) throw new CommandException();
		for(int i = 0; i< side; i++) {
			for(int j=0;j < offset; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < side; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println("");
		}
		
	}
	public void unDoMoveSqure() {
		System.out.println("in unDoScale");

	}
	public void unDoScale() {
		System.out.println("in unDoScale");
	
	}
	public void unDoCreateSquare() {
		result = null;
		System.out.println("in unDoCreateSquare");
	}

}
