package com;

public class Enode implements Component {

	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitor(this);
	}
	public Integer getSide() {
		return 4;
	}
	public String getName() {
		return "E";
	}
}
