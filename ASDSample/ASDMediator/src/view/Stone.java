package view;

import java.util.List;

import application.Position;

public interface Stone {
	public List<Position> display(Mediator mediator);

	public void changeColor();
}
