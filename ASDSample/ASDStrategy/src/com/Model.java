package com;

import java.util.List;

public interface Model {
	public static long BASE_TICKET = 300;
	public static long FIXED_COST = 50000;
	
	public long getRevenue(List<Flight> flights);
}
