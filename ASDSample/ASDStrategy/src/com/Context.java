package com;

import java.util.List;

public class Context {
	private Model model;

	public Context(Model model) {
		this.model = model;
	}
	public long executeStrategy(List<Flight> flights){
		return model.getRevenue(flights);
		}	
}
