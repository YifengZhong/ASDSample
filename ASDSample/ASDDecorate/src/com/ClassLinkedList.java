package com;

import java.util.LinkedList;
import java.util.List;

public class ClassLinkedList implements Component<String>{

	List<String> list = new LinkedList<>();
	@Override
	public boolean add(String e) {
		list.add(e);
		return false;
	}

	@Override
	public boolean remove(String e) {
		list.remove(e);
		return false;
	}

	@Override
	public boolean contains(String e) {
		list.contains(e);
		return false;
	}

	@Override
	public boolean size(String e) {
		list.size();
		return false;
	}

}
