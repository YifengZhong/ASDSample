package com;

public class Anode implements Component {

	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitor(this);
	}
	
	public Integer getSide() {
		return 6;
	}
	public String getName() {
		return "A";
	}

}
