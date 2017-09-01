package com;

public class Root implements Component {
	
	private boolean state = false;

	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitor(this);	
	}
	public String getName() {
		if (state == false) {
			state = true;
			return "RIGHT SIDE";
		} else {
			state = false;
			return "LEFT SIDE";
		}
	}

}
