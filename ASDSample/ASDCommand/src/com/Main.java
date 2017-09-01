package com;

public class Main {

	public static void main(String[] args) {
		WorkOnIt workOnIt = new WorkOnIt();
		Broker broker = new Broker();
		broker.takeOrder(new CreateSquare(5,workOnIt));
		broker.takeOrder(new ScaleSquare(6,workOnIt));
		broker.takeOrder(new MoveSquare(100,workOnIt));
		
		broker.placeOrder();
	}

}
