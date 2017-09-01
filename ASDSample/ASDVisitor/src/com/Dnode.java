package com;

public class Dnode implements Component {

	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitor(this);
	
	}
	public Integer getSide() {
		return 3;
	}
	public String getName() {
		return "D";
	}
}
