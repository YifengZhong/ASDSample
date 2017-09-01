package com;

import java.util.ArrayList;
import java.util.List;

public class ClassArrayList implements Component<String> {
	
	private List<String> list = new ArrayList<>();
	
	@Override
	public boolean add(String e) {
		list.add((String) e);
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
