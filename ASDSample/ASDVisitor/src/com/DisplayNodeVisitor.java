package com;

public class DisplayNodeVisitor implements NodeVisitor {

	@Override
	public void visitor(Anode anode) {
		System.out.println(anode.getSide() + " " + anode.getName() + " nodes");
	}

	@Override
	public void visitor(Bnode bnode) {
		System.out.println(bnode.getSide() + " " + bnode.getName() + " nodes");
	}

	@Override
	public void visitor(Cnode cnode) {
		System.out.println(cnode.getSide() + " " + cnode.getName() + " nodes");
	}

	@Override
	public void visitor(Dnode dnode) {
		System.out.println(dnode.getSide() + " " + dnode.getName() + " nodes");
	}

	@Override
	public void visitor(Enode enode) {
		System.out.println(enode.getSide() + " " + enode.getName() + " nodes");
	}

	@Override
	public void visitor(Fnode fnode) {
		System.out.println(fnode.getSide() + " " + fnode.getName() + " nodes");
	}

	@Override
	public void visitor(Root root) {
		System.out.println(root.getName());
		
	}

}
