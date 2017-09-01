package com;

public class ComponentDecorate implements Component<String> {
	
	Component component;
	

	public ComponentDecorate(Component component) {
		this.component = component;
	}

	@Override
	public boolean add(String e) {
		component.add(e);
		return false;
	}

	@Override
	public boolean remove(String e) {
		component.remove(e);
		return false;
	}

	@Override
	public boolean contains(String e) {
		component.remove(e);
		return false;
	}

	@Override
	public boolean size(String e) {
		component.size(e);
		return false;
	}

}
