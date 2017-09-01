package com;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Component> list = new ArrayList<>();
		Root root = new Root();
		list.add(root);
		list.add(new Anode());
		list.add(new Bnode());
		list.add(new Cnode());
		list.add(root);
		list.add(new Dnode());
		list.add(new Enode());
		list.add(new Fnode());
		list.stream().forEach(x->x.accept(new DisplayNodeVisitor()));
		
	}
}
