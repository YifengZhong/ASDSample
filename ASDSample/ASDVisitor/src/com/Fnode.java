package com;

public class Fnode implements Component {

	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitor(this);	
	}
	public Integer getSide() {
		return 3;
	}
	public String getName() {
		return "F";
	}
}
