package view;

import java.util.List;

import application.Position;

public class A0 implements Stone {
	
	int x;
	int y;


	public A0(int x, int y) {
		this.x = x;
		this.y = y;
	}



	@Override
	public List<Position> display(Mediator mediator) {
		return mediator.changeColor(x,y);
		
	}



	@Override
	public void changeColor() {
		// TODO Auto-generated method stub
		
	}

}
